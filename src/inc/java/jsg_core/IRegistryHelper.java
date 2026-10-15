package dev.tauri.jsgcore.common.registry.helper;

/**
 * Helper class that helps creating and registering deferred registers
 */
public interface IRegistryHelper {
    /**
     * Registers all created deferred registers to the mod event bus
     * @param eventBus the mod's event bus
     */
    void register(IEventBus eventBus);

    /**
     * Append the deferredRegister to the list of registers that will be registered to the bus
     * @param deferredRegister the register to register
     */
    void toRegister(DeferredRegisterWrapper<?> deferredRegister);

    /**
     * Runnable that will run when binding menus to GUIs
     * @param runnable the runnable to run
     * @return self
     */
    RegistryHelper guiRegister(Runnable runnable);

    /**
     * Runnable that will run when binding entities with their renderers
     * @param runnable the runnable to run
     * @return self
     */
    RegistryHelper entityRendererRegister(Runnable runnable);

    /**
     * Runnable that will run when binding block entities with their renderers
     * @param supplier list of bind BE to renderer
     * @return self
     */
    RegistryHelper beRenderers(Supplier<List<RegistryHelper.BlockEntityRendererPair<?>>> supplier);


    /**
     * Creates a new DeferredRegister object of type FluidType, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<FluidType> fluidType();

    /**
     * Creates a new DeferredRegister object of type Fluid, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<Fluid> fluid();

    /**
     * Creates a new DeferredRegister object of type PoiType, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<PoiType> poi();

    /**
     * Creates a new DeferredRegister object of type VillagerType, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<VillagerType> villagerType();

    /**
     * Creates a new DeferredRegister object of type VillagerProfession, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<VillagerProfession> villagerProfession();

    /**
     * Creates a new DeferredRegister object of type EntityType, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<EntityType<?>> entity();

    /**
     * Creates a new DeferredRegister object of type StructureType, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<StructureType<?>> structureType();

    /**
     * Creates a new DeferredRegister object of type Feature, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<Feature<?>> feature();

    /**
     * Creates a new DeferredRegister object of type MenuType, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<MenuType<?>> menu();

    /**
     * Creates a new DeferredRegister object of type StateType, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<StateType> state();

    /**
     * Creates a new DeferredRegister object of type SymbolUsage, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<SymbolUsage> symbolUsage();

    /**
     * Creates a new DeferredRegister object of type SymbolType, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<SymbolType<?>> symbolType();

    /**
     * Creates a new DeferredRegister object of type SoundEvent, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<SoundEvent> sound();

    /**
     * Creates a new DeferredRegister object of type CreativeModeTab, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<CreativeModeTab> tab();

    /**
     * Creates a new DeferredRegister object of type BlockEntityType, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<BlockEntityType<?>> be();

    /**
     * Creates a new DeferredRegister object of type Block, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<Block> block();

    /**
     * Creates a new DeferredRegister object of type Item, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<Item> item();

    /**
     * Creates a new DeferredRegister object of type ScheduledTaskType, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<ScheduledTaskType> scheduledTask();

    /**
     * Creates a new DeferredRegister object of type BiomeOverlayInstance, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<BiomeOverlayInstance> biomeOverlay();

    /**
     * Creates a new DeferredRegister object of type NotebookPageType, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<NotebookPageType<?>> notebookPage();

    /**
     * Creates a new DeferredRegister object of type IPointOfOriginType, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<IPointOfOriginType> pooType();

    /**
     * Creates a new DeferredRegister object of type Raycaster, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<Raycaster> raycaster();

    /**
     * Creates a new DeferredRegister object of type RecipeType, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<RecipeType<?>> recipeType();

    /**
     * Creates a new DeferredRegister object of type RecipeSerializer, if not created already.
     * @return the created/already present register
     */
    DeferredRegisterWrapper<RecipeSerializer<?>> recipeSerializer();

    /**
     * Creates a new DeferredRegister object of type you like, if not created already.
     * @return the created/already present register
     */
    <B> DeferredRegisterWrapper<B> other(IForgeRegistry<B> registry);
}
