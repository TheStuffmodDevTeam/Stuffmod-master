//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.hacker.stuffmod.world.structures;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolBasedGenerator;
import net.minecraft.structure.pool.alias.StructurePoolAliasBinding;
import net.minecraft.structure.pool.alias.StructurePoolAliasLookup;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.Heightmap.Type;
import net.minecraft.world.gen.HeightContext;
import net.minecraft.world.gen.heightprovider.HeightProvider;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;

public final class ModJigsawStructure extends Structure {
    public static final int MAX_SIZE = 128;
    public static final int MAX_GENERATION_DEPTH = 20;
    public static final Codec<ModJigsawStructure> CODEC = Codecs.validate(RecordCodecBuilder.mapCodec((instance) -> instance.group(configCodecBuilder(instance), StructurePool.REGISTRY_CODEC.fieldOf("start_pool").forGetter((structure) -> structure.startPool), Identifier.CODEC.optionalFieldOf("start_jigsaw_name").forGetter((structure) -> structure.startJigsawName), Codec.intRange(0, 20).fieldOf("size").forGetter((structure) -> structure.size), HeightProvider.CODEC.fieldOf("start_height").forGetter((structure) -> structure.startHeight), Codec.BOOL.fieldOf("use_expansion_hack").forGetter((structure) -> structure.useExpansionHack), Type.CODEC.optionalFieldOf("project_start_to_heightmap").forGetter((structure) -> structure.projectStartToHeightmap), Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter((structure) -> structure.maxDistanceFromCenter), Codec.list(StructurePoolAliasBinding.CODEC).optionalFieldOf("pool_aliases", List.of()).forGetter((structure) -> structure.poolAliasBindings)).apply(instance, ModJigsawStructure::new)), ModJigsawStructure::validate).codec();
    private final RegistryEntry<StructurePool> startPool;
    private final Optional<Identifier> startJigsawName;
    private final int size;
    private final HeightProvider startHeight;
    private final boolean useExpansionHack;
    private final Optional<Heightmap.Type> projectStartToHeightmap;
    private final int maxDistanceFromCenter;
    private final List<StructurePoolAliasBinding> poolAliasBindings;

    private static DataResult<ModJigsawStructure> validate(ModJigsawStructure structure) {
        byte var10000;
        switch (structure.getTerrainAdaptation()) {
            case NONE:
                var10000 = 0;
                break;
            case BURY:
            case BEARD_THIN:
            case BEARD_BOX:
                var10000 = 12;
                break;
            default:
                throw new IncompatibleClassChangeError();
        }

        int i = var10000;
        return structure.maxDistanceFromCenter + i > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success(structure);
    }

    public ModJigsawStructure(Structure.Config config, RegistryEntry<StructurePool> startPool, Optional<Identifier> startJigsawName, int size, HeightProvider startHeight, boolean useExpansionHack, Optional<Heightmap.Type> projectStartToHeightmap, int maxDistanceFromCenter, List<StructurePoolAliasBinding> poolAliasBindings) {
        super(config);
        this.startPool = startPool;
        this.startJigsawName = startJigsawName;
        this.size = size;
        this.startHeight = startHeight;
        this.useExpansionHack = useExpansionHack;
        this.projectStartToHeightmap = projectStartToHeightmap;
        this.maxDistanceFromCenter = maxDistanceFromCenter;
        this.poolAliasBindings = poolAliasBindings;
    }

    public ModJigsawStructure(Structure.Config config, RegistryEntry<StructurePool> startPool, int size, HeightProvider startHeight, boolean useExpansionHack, Heightmap.Type projectStartToHeightmap) {
        this(config, startPool, Optional.empty(), size, startHeight, useExpansionHack, Optional.of(projectStartToHeightmap), 80, List.of());
    }

    public ModJigsawStructure(Structure.Config config, RegistryEntry<StructurePool> startPool, int size, HeightProvider startHeight, boolean useExpansionHack) {
        this(config, startPool, Optional.empty(), size, startHeight, useExpansionHack, Optional.empty(), 80, List.of());
    }

    public Optional<Structure.StructurePosition> getStructurePosition(Structure.Context context) {
        ChunkPos chunkPos = context.chunkPos();
        int i = this.startHeight.get(context.random(), new HeightContext(context.chunkGenerator(), context.world()));
        BlockPos blockPos = new BlockPos(chunkPos.getStartX(), i, chunkPos.getStartZ());
        return StructurePoolBasedGenerator.generate(context, this.startPool, this.startJigsawName, this.size, blockPos, this.useExpansionHack, this.projectStartToHeightmap, this.maxDistanceFromCenter, StructurePoolAliasLookup.create(this.poolAliasBindings, blockPos, context.seed()));
    }

    public StructureType<?> getType() {
        return StructureType.JIGSAW;
    }

    public List<StructurePoolAliasBinding> getPoolAliasBindings() {
        return this.poolAliasBindings;
    }
}
