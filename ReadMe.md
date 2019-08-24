# Materials Plus (Working title)
A mod designed to reduce the amount of effort it takes to create new materials. <br /> <br />
## Major pluses of centralizing materials include:
 - Less resources have to be loaded into large modpacks
 - More variety in vanilla+ style packs
 - Easier addition of materials for all modders who choose to utilize it
 - Far easier resource (texture, model) creation
 - Less weird texture variation between mods, due to most textures now being centralized
 - Better in-game storage management for players, now that they don't have multiple versions of the same item
 
## "Well that's great but how does it work?"
Well, that's simpler than ever, if you use this codebase. <br />
To create a set of all possible derivatives (ingot/gem, dust, plate, nugget/shard, purified dust, impure dust, ore, and storage block) just add your material name to [these lists](https://github.com/halotroop2288/MaterialsPlusMod/blob/master/src/main/java/com/github/halotroop2288/materialsplus/init/Materials.java)<br />
To create a custom set of derivatives, add a new QuickMetalSet or QuickGemSet [here](), selecting all the types you want with a boolean value. And add it to the registry manually [here]<br />(https://github.com/halotroop2288/MaterialsPlusMod/blob/master/src/main/java/com/github/halotroop2288/materialsplus/MaterialsPlus.java#L72).<br />
Then all you have to do is decide what you want your resources to look like and recolour a few textures, or add your own (just make sure it doesn't look too out-of-the-style-guide.) <br />
Make a pull request and I might suggest some edits, but then you're done! The material will be included in the next update, and you can use this mod as a dependency for yours to use it how you see fit.