package net.hacker.stuffmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hacker.stuffmod.block.ModBlocks;
import net.hacker.stuffmod.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.core.jmx.StatusLoggerAdminMBean;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> EEEE_SMELTING = List.of(ModBlocks.EEEE_ORE,
            ModBlocks.DEEPSLATE_EEEE_ORE, ModItems.EEEE, ModItems.THEHIDDENONE);
    private static final List<ItemConvertible> ENDERITE_SMELTING = List.of(ModBlocks.ENDERITE_ORE, ModItems.ENDERITE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, EEEE_SMELTING, RecipeCategory.MISC, ModItems.EEEE_INGOT, 1.0f, 200, "eeee");
        offerBlasting(exporter, EEEE_SMELTING, RecipeCategory.MISC, ModItems.EEEE_INGOT, 1.0f, 100, "eeee");
        offerBlasting(exporter, ENDERITE_SMELTING, RecipeCategory.MISC, ModItems.ENDERITE_INGOT, 10.0f, 200, "enderite");
        offerSmelting(exporter, ENDERITE_SMELTING, RecipeCategory.MISC, ModItems.ENDERITE_INGOT, 10.0f, 400, "enderite");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.EEEE, RecipeCategory.DECORATIONS, ModBlocks.EEEE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDERITE, RecipeCategory.DECORATIONS, ModBlocks.ENDERITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDERITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ENDERITE_INGOT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LAOC, RecipeCategory.DECORATIONS, ModBlocks.LAOC_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.EEEE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.EEEE_INGOT_BLOCK);

        createDoorRecipe(ModBlocks.FIREY_VOID_DOOR, Ingredient.ofItems(ModBlocks.FIREY_VOID_PLANKS)).criterion(hasItem(ModBlocks.FIREY_VOID_PLANKS), conditionsFromItem(ModBlocks.FIREY_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIREY_VOID_DOOR)));
        createStairsRecipe(ModBlocks.FIREY_VOID_STAIRS, Ingredient.ofItems(ModBlocks.FIREY_VOID_PLANKS)).criterion(hasItem(ModBlocks.FIREY_VOID_PLANKS), conditionsFromItem(ModBlocks.FIREY_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIREY_VOID_STAIRS)));
        createTrapdoorRecipe(ModBlocks.FIREY_VOID_TRAPDOOR, Ingredient.ofItems(ModBlocks.FIREY_VOID_PLANKS)).criterion(hasItem(ModBlocks.FIREY_VOID_PLANKS), conditionsFromItem(ModBlocks.FIREY_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIREY_VOID_TRAPDOOR)));
        createFenceGateRecipe(ModBlocks.FIREY_VOID_FENCE_GATE, Ingredient.ofItems(ModBlocks.FIREY_VOID_PLANKS)).criterion(hasItem(ModBlocks.FIREY_VOID_PLANKS), conditionsFromItem(ModBlocks.FIREY_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIREY_VOID_FENCE_GATE)));
        createFenceRecipe(ModBlocks.FIREY_VOID_FENCE, Ingredient.ofItems(ModBlocks.FIREY_VOID_PLANKS)).criterion(hasItem(ModBlocks.FIREY_VOID_PLANKS), conditionsFromItem(ModBlocks.FIREY_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIREY_VOID_FENCE)));
        createPressurePlateRecipe(RecipeCategory.MISC, ModBlocks.FIREY_VOID_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.FIREY_VOID_PLANKS)).criterion(hasItem(ModBlocks.FIREY_VOID_PLANKS), conditionsFromItem(ModBlocks.FIREY_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIREY_VOID_PRESSURE_PLATE)));
        createSlabRecipe(RecipeCategory.MISC, ModBlocks.FIREY_VOID_SLAB, Ingredient.ofItems(ModBlocks.FIREY_VOID_PLANKS)).criterion(hasItem(ModBlocks.FIREY_VOID_PLANKS), conditionsFromItem(ModBlocks.FIREY_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIREY_VOID_SLAB)));

        createDoorRecipe(ModBlocks.ICEE_VOID_DOOR, Ingredient.ofItems(ModBlocks.ICEE_VOID_PLANKS)).criterion(hasItem(ModBlocks.ICEE_VOID_PLANKS), conditionsFromItem(ModBlocks.ICEE_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ICEE_VOID_DOOR)));
        createStairsRecipe(ModBlocks.ICEE_VOID_STAIRS, Ingredient.ofItems(ModBlocks.ICEE_VOID_PLANKS)).criterion(hasItem(ModBlocks.ICEE_VOID_PLANKS), conditionsFromItem(ModBlocks.ICEE_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ICEE_VOID_STAIRS)));
        createTrapdoorRecipe(ModBlocks.ICEE_VOID_TRAPDOOR, Ingredient.ofItems(ModBlocks.ICEE_VOID_PLANKS)).criterion(hasItem(ModBlocks.ICEE_VOID_PLANKS), conditionsFromItem(ModBlocks.ICEE_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ICEE_VOID_TRAPDOOR)));
        createFenceGateRecipe(ModBlocks.ICEE_VOID_FENCE_GATE, Ingredient.ofItems(ModBlocks.ICEE_VOID_PLANKS)).criterion(hasItem(ModBlocks.ICEE_VOID_PLANKS), conditionsFromItem(ModBlocks.ICEE_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ICEE_VOID_FENCE_GATE)));
        createFenceRecipe(ModBlocks.ICEE_VOID_FENCE, Ingredient.ofItems(ModBlocks.ICEE_VOID_PLANKS)).criterion(hasItem(ModBlocks.ICEE_VOID_PLANKS), conditionsFromItem(ModBlocks.ICEE_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ICEE_VOID_FENCE)));
        createPressurePlateRecipe(RecipeCategory.MISC, ModBlocks.ICEE_VOID_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.ICEE_VOID_PLANKS)).criterion(hasItem(ModBlocks.ICEE_VOID_PLANKS), conditionsFromItem(ModBlocks.ICEE_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ICEE_VOID_PRESSURE_PLATE)));
        createSlabRecipe(RecipeCategory.MISC, ModBlocks.ICEE_VOID_SLAB, Ingredient.ofItems(ModBlocks.ICEE_VOID_PLANKS)).criterion(hasItem(ModBlocks.ICEE_VOID_PLANKS), conditionsFromItem(ModBlocks.ICEE_VOID_PLANKS)).offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ICEE_VOID_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ICEE_VOID_WALL, 6)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModBlocks.ICEE_VOID_PLANKS)
                .criterion(hasItem(ModBlocks.ICEE_VOID_PLANKS), conditionsFromItem(ModBlocks.ICEE_VOID_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ICEE_VOID_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ICEE_VOID_BUTTON, 1)
                .pattern("S")
                .input('S', ModBlocks.ICEE_VOID_PLANKS)
                .criterion(hasItem(ModBlocks.ICEE_VOID_PLANKS), conditionsFromItem(ModBlocks.ICEE_VOID_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ICEE_VOID_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FIREY_VOID_WALL, 6)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModBlocks.FIREY_VOID_PLANKS)
                .criterion(hasItem(ModBlocks.FIREY_VOID_PLANKS), conditionsFromItem(ModBlocks.FIREY_VOID_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIREY_VOID_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FIREY_VOID_BUTTON, 1)
                .pattern("S")
                .input('S', ModBlocks.FIREY_VOID_PLANKS)
                .criterion(hasItem(ModBlocks.FIREY_VOID_PLANKS), conditionsFromItem(ModBlocks.FIREY_VOID_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIREY_VOID_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EEEE_MADALIEAN, 1)
                .pattern("SXS")
                .pattern("XSX")
                .pattern("SXS")
                .input('S', ModItems.EEEE_INGOT)
                .input('X', ModItems.EEEE)
                .criterion(hasItem(ModItems.EEEE), conditionsFromItem(ModItems.EEEE))
                .criterion(hasItem(ModItems.EEEE_INGOT), conditionsFromItem(ModItems.EEEE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EEEE_MADALIEAN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.METAL_DETECTORT1, 1)
                .pattern("  S")
                .pattern(" SX")
                .pattern("S  ")
                .input('S', Items.STICK)
                .input('X', Items.IRON_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.METAL_DETECTORT1)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.METAL_DETECTORT2, 1)
                .pattern("  S")
                .pattern(" SX")
                .pattern("S  ")
                .input('S', Items.BLAZE_ROD)
                .input('X', Items.REDSTONE_BLOCK)
                .criterion(hasItem(Items.BLAZE_ROD), conditionsFromItem(Items.BLAZE_ROD))
                .criterion(hasItem(Items.REDSTONE_BLOCK), conditionsFromItem(Items.REDSTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.METAL_DETECTORT2)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.METAL_DETECTORT3, 1)
                .pattern("  S")
                .pattern(" SX")
                .pattern("S  ")
                .input('S', ModItems.DIAMOND_ROD)
                .input('X', ModItems.EEEE)
                .criterion(hasItem(ModItems.DIAMOND_ROD), conditionsFromItem(ModItems.DIAMOND_ROD))
                .criterion(hasItem(ModItems.EEEE), conditionsFromItem(ModItems.EEEE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.METAL_DETECTORT3)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_ROD, 2)
                .pattern("S")
                .pattern("S")
                .input('S', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FIREY_VOID_PLANKS, 4)
                .pattern("S")
                .input('S', ModBlocks.FIREY_VOID_LOG)
                .criterion(hasItem(ModBlocks.FIREY_VOID_LOG), conditionsFromItem(ModBlocks.FIREY_VOID_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIREY_VOID_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EEEE_PICKAXE, 1)
                .pattern("XXX")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', ModItems.EEEE_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.EEEE_INGOT), conditionsFromItem(ModItems.EEEE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EEEE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EEEE_AXE, 1)
                .pattern("XX ")
                .pattern("XS ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', ModItems.EEEE_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.EEEE_INGOT), conditionsFromItem(ModItems.EEEE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EEEE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EEEE_SHOVEL, 1)
                .pattern(" X ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', ModItems.EEEE_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.EEEE_INGOT), conditionsFromItem(ModItems.EEEE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EEEE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EEEE_SWORD, 1)
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', ModItems.EEEE_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.EEEE_INGOT), conditionsFromItem(ModItems.EEEE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EEEE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EEEE_HOE, 1)
                .pattern("XX ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', ModItems.EEEE_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.EEEE_INGOT), conditionsFromItem(ModItems.EEEE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EEEE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EEEE_SCYTHE, 1)
                .pattern("YXY")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', ModItems.DIAMOND_ROD)
                .input('X', ModItems.EEEE_HOE)
                .input('Y', ModItems.EEEE_SWORD)
                .criterion(hasItem(ModItems.EEEE_SWORD), conditionsFromItem(ModItems.EEEE_SWORD))
                .criterion(hasItem(ModItems.EEEE_HOE), conditionsFromItem(ModItems.EEEE_HOE))
                .criterion(hasItem(ModItems.DIAMOND_ROD), conditionsFromItem(ModItems.DIAMOND_ROD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EEEE_SCYTHE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HOE, 1)
                .pattern("XX ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', Items.COPPER_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_AXE, 1)
                .pattern("XX ")
                .pattern("XS ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', Items.COPPER_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_SHOVEL, 1)
                .pattern(" X ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', Items.COPPER_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_PICKAXE, 1)
                .pattern("XXX")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', Items.COPPER_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_SWORD, 1)
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', Items.COPPER_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPER_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_HOE, 1)
                .pattern("XX ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', Items.EMERALD)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_AXE, 1)
                .pattern("XX ")
                .pattern("XS ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', Items.EMERALD)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_SHOVEL, 1)
                .pattern(" X ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', Items.EMERALD)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_PICKAXE, 1)
                .pattern("XXX")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', Items.EMERALD)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_SWORD, 1)
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('X', Items.EMERALD)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EMERALD_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EEEE_HELMET, 1)
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .input('S', ModItems.EEEE_INGOT)
                .criterion(hasItem(ModItems.EEEE_INGOT), conditionsFromItem(ModItems.EEEE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EEEE_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EEEE_CHESTPLATE, 1)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.EEEE_INGOT)
                .criterion(hasItem(ModItems.EEEE_INGOT), conditionsFromItem(ModItems.EEEE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EEEE_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EEEE_LEGGINGS, 1)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.EEEE_INGOT)
                .criterion(hasItem(ModItems.EEEE_INGOT), conditionsFromItem(ModItems.EEEE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EEEE_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EEEE_BOOTS, 1)
                .pattern("   ")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.EEEE_INGOT)
                .criterion(hasItem(ModItems.EEEE_INGOT), conditionsFromItem(ModItems.EEEE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EEEE_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THEHIDDENONE, 5)
                .pattern("S")
                .input('S', Items.EMERALD)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.THEHIDDENONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.TOTEM_OF_UNDYING, 5)
                .pattern("S")
                .input('S', ModItems.THEHIDDENONE)
                .criterion(hasItem(ModItems.THEHIDDENONE), conditionsFromItem(ModItems.THEHIDDENONE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.TOTEM_OF_UNDYING)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DEALER_TABLE, 1)
                .pattern("YXY")
                .pattern("XCX")
                .pattern("YXY")
                .input('X', Items.TOTEM_OF_UNDYING)
                .input('C', Items.NETHERITE_BLOCK)
                .input('Y', Items.DIAMOND)
                .criterion(hasItem(Items.TOTEM_OF_UNDYING), conditionsFromItem(Items.TOTEM_OF_UNDYING))
                .criterion(hasItem(Items.NETHERITE_BLOCK), conditionsFromItem(Items.NETHERITE_BLOCK))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEALER_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_BOOTS, 1)
                .pattern("   ")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.ENDERITE_INGOT)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDERITE_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_LEGGINGS, 1)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.ENDERITE_INGOT)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDERITE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_CHESTPLATE, 1)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.ENDERITE_INGOT)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDERITE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_HELMET, 1)
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .input('S', ModItems.ENDERITE_INGOT)
                .criterion(hasItem(ModItems.ENDERITE_INGOT), conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDERITE_HELMET)));
    }
}
