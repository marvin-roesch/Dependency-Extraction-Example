Dependency Extraction Examples
==============================

This repository serves as a collection of example projects (or rather `build.gradle` files) which use [Forge's](https://github.com/MinecraftForge/MinecraftForge) built-in dependency extraction capabilities.

*Note that some of theses examples might require [MinecraftForge#4081](https://github.com/MinecraftForge/MinecraftForge/pull/4081) to be merged before they can be properly extracted.*

Examples
--------

All examples occupy their own branch and don't need any special setup after cloning, simply run `gradlew build` to see the result.

There currently are two examples in this repository, one for coremods and another for arbitrary (Maven) dependencies:

 - [Coremod separation example](https://github.com/PaleoCrafter/Dependency-Extraction-Example/tree/coremod-separation/#coremod-separation)
 - [Library embedding example](https://github.com/PaleoCrafter/Dependency-Extraction-Example/tree/library-embedding/#library-embedding)
 
### Coremod separation

This minimal example uses the Forge dependency extraction system as a helpful tool to make a mod comply with [Forge's coremod guidelines](http://www.minecraftforge.net/forum/topic/58706-regarding-minecraft-112-and-policy-changes/) without much effort. All that is really required can be found in these [build.gradle lines](https://github.com/PaleoCrafter/Dependency-Extraction-Example/blob/coremod-separation/build.gradle#L45).

In addition to the basic dependency extraction, this example complies with the system put forth in [MinecraftForge#4081](https://github.com/MinecraftForge/MinecraftForge/pull/4081), which will be the new standard for dependency extraction some time in the future.

### Library embedding

This example provides an alternative to classical shading techniques for shipping (Maven) libraries alongside your mod. All that is required can be found in these [build.gradle lines](https://github.com/PaleoCrafter/Dependency-Extraction-Example/blob/library-embedding/build.gradle#L45) and adding as many dependencies as you like is a breeze.

If and when [MinecraftForge#4081](https://github.com/MinecraftForge/MinecraftForge/pull/4081) gets merged, you will additionally benefit from the simple version management system. If two mods ship the same library as extracted dependency with different versions, the newer version of the library will always be preferred.
