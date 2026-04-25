# ⚒ AddaFurniture Mod
### Minecraft 1.20.4 | Fabric API

The ultimate furniture, lifestyle & wildlife mod! 100+ items + 12 custom mobs!

---

## 📦 Requirements

| Dependency | Version | Required? |
|---|---|---|
| Minecraft | 1.20.4 | ✅ Yes |
| Fabric Loader | ≥ 0.15.7 | ✅ Yes |
| Fabric API | 0.92.x for 1.20.4 | ✅ Yes |
| Java | 17 or 21 | ✅ Yes |
| Mod Menu | 9.x | Optional |

---

## 🪑 Furniture Items

- Wooden Chair, Gaming Chair, Party Chair
- Sofa (3-piece: Left, Middle, Right)
- Almirah (wardrobe)
- Study Table, Dining Table, Computer Desk
- Drawer Chest, Fancy Bookshelf, Wall Shelf
- Double Bed, Bunk Bed

## 🖥️ Tech Items

- Gaming PC (RGB lit!), Noob PC
- Monitor Small & Large
- Smart TV (55")
- WiFi Router
- RGB LED Strip (luminance 10)

## ❄️ Appliances

- Air Conditioner
- Ceiling Fan
- Refrigerator, Washing Machine, Microwave
- Gas Stove

## 🍺 Drinks (with Effects!)

| Drink | Effect |
|---|---|
| Water Bottle | Regeneration I (3s) |
| Beer Can | Strength I + Slowness |
| Cold Drink | Haste I |
| Coffee Mug | Speed I + Haste I |
| Juice Pack | Regeneration I |
| Green Tea | Regen II + Absorption |
| Energy Drink | Speed II + Haste II + Jump Boost |

## 🎒 Bags

School Bag, College Bag, Laptop Bag, Travel Bag, Sling Bag, Gym Bag, Shopping Bag, Tiffin Box

## ⛑️ Safety

Bike Helmet (wearable!), Full Face Helmet, Construction Helmet, Safety Vest, Fire Extinguisher, Security Camera

## 🚗 Vehicles (Rideable!)

| Vehicle | Color | Speed |
|---|---|---|
| Car | Red | Fast |
| Bike | Orange | Very Fast |
| Scooter | Blue | Medium |

## 🦁 Custom Mobs (NOT in vanilla MC!)

| Mob | Type | HP | Tame? | Biome |
|---|---|---|---|---|
| 🐘 Elephant | Passive | 60❤ | Sugar Cane | Savanna |
| 🐅 Tiger | Hostile | 30❤ | Raw Meat (10%) | Jungle |
| 🦁 Lion | Hostile | 40❤ | ❌ | Savanna |
| 🦒 Giraffe | Passive | 20❤ | ❌ | Savanna |
| 🦓 Zebra | Passive | 20❤ | ❌ | Savanna/Plains |
| 🦛 Hippo | Neutral | 20❤ | ❌ | Rivers |
| 🦍 Gorilla | Neutral | 20❤ | ❌ | Jungle |
| 🐧 Penguin | Passive | 20❤ | ❌ | Snowy Biomes |
| 🦩 Flamingo | Passive | 20❤ | ❌ | Swamp/Beach |
| 🐊 Crocodile | Hostile | 20❤ | ❌ | Swamp/Rivers |
| 🦈 Shark | Hostile | 20❤ | ❌ | Ocean |
| 🦘 Kangaroo | Passive | 20❤ | ❌ | Savanna |

### Mob Drops
- Elephant → **Elephant Tusk** (crafting material)
- Tiger → **Tiger Fur** (armor/cosmetics)
- Lion → **Lion Mane** (rare drop)
- Crocodile → **Crocodile Scale**
- Shark → **Shark Fin**
- Kangaroo → **Kangaroo Pouch** (portable inventory!)

---

## 🔧 Building the Mod

```bash
# Clone the repo
git clone https://github.com/addafurniture/addafurniture-mod
cd addafurniture-mod

# Build with Gradle
./gradlew build

# Output JAR will be at:
# build/libs/addafurniture-1.0.0.jar
```

## 📁 Installation

1. Install **Fabric Loader 0.15.7+** for MC 1.20.4
2. Download **Fabric API 0.92.x** → put in `.minecraft/mods/`
3. Put `addafurniture-1.0.0.jar` in `.minecraft/mods/`
4. Launch with Fabric profile
5. Use `/give @s addafurniture:elephant_spawn_egg` to spawn mobs!

---

## 🗺️ Project Structure

```
addafurniture-mod/
├── build.gradle
├── gradle.properties           ← Mod version, MC version, deps
├── settings.gradle
├── gradle/wrapper/
└── src/main/
    ├── java/com/addafurniture/
    │   ├── AddaFurnitureMod.java       ← Main entrypoint
    │   ├── block/                      ← All block classes
    │   ├── item/                       ← DrinkItem, BagItem, etc.
    │   ├── entity/
    │   │   ├── mob/                    ← Elephant, Tiger, Lion...
    │   │   └── vehicle/               ← Car, Bike, Scooter
    │   ├── registry/
    │   │   ├── ModBlocks.java
    │   │   ├── ModItems.java
    │   │   ├── ModEntities.java
    │   │   └── ModItemGroups.java
    │   └── client/
    │       └── AddaFurnitureClient.java
    └── resources/
        ├── fabric.mod.json
        └── assets/addafurniture/
            ├── lang/en_us.json
            ├── models/
            ├── textures/
            └── blockstates/
```

---

## 🎨 To-Do (Full Release)

- [ ] Custom Blockbench models for all blocks
- [ ] Custom textures for all items
- [ ] Custom mob models & animations in Blockbench
- [ ] Custom sounds (elephant trumpet, tiger roar, etc.)
- [ ] Riding mechanics for Elephant & Kangaroo
- [ ] Almirah GUI (wardrobe inventory)
- [ ] Kangaroo Pouch inventory
- [ ] Biome-specific spawning rules

---

Made with ❤️ | AddaFurniture Team
