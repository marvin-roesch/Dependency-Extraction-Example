Dependency Extraction Example
============================

This is a minimal example for the Forge dependency extraction system, a helpful tool to make a mod comply with [Forge's coremod guidelines](http://www.minecraftforge.net/forum/topic/58706-regarding-minecraft-112-and-policy-changes/) without much effort. All that is really required can be found in these [build.gradle lines](https://github.com/PaleoCrafter/Dependency-Extraction-Example/blob/master/build.gradle#L45).

There is one minor quirk to the system, namely that the time at which the extraction happens is too late for a coremod to be loaded. This means that the actual mod JAR distributed will be the coremod, containing the normal mod as extractable dependency.

In addition to the basic dependency extraction, this example complies with the system put forth in [MinecraftForge#4081](https://github.com/MinecraftForge/MinecraftForge/pull/4081), which will be the new standard for dependency extraction some time in the future. When the PR gets merged, you'll also be able to ship the coremod *inside* the main JAR.