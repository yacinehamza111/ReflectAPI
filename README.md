# ReflectAPI
![](https://jitpack.io/v/yacinehamza111/ReflectAPI.svg)

an API plugin that makes it easy to make plugins!


To add **ReflectAPI** to your plugin, add the following code below:

```xml
<repository>
	<id>jitpack.io</id>
	<url>https://jitpack.io</url>
</repository>
```

```xml
<dependency>
	<groupId>com.github.yacinehamza111</groupId>
	<artifactId>ReflectAPI</artifactId>
	<version>Tag</version>
</dependency>
```

Replace the `Tag` with the current version which is in the jitpack badge.




To make a command using **ReflectAPI** to your plugin, you have to make a package called `commands`, when you are done making it. Make a new class called `<commandname>Comnmand` (replace the `<commandname>` with the command name your gonna make).

Then, copy the code below:

```Java
package me.yacinehamza111.reflectapi.commands; // replace the package with your package or else you will get an error.

import me.yacinehamza111.reflectapi.utils.Color;
import me.yacinehamza111.reflectapi.utils.CommandCreator;
import me.yacinehamza111.reflectapi.utils.CommandInfo;
import org.bukkit.entity.Player;

@CommandInfo(name = "test", requiresPlayer = true) // the name is for the command name (also, replace the 'test' command name to your command name), and the requiresPlayer just makes it so if the command requires a player to execute it, then keep it to true. Otherwise make it false to make it so only console can run the command.
public class TestCommand extends CommandCreator { // replace the TestCommand class to your class (don't rename your class to TestCommand since its not necessary)

    @Override
    public void execute(Player player, String[] args) {
	player.sendMessage("Hello World!");
	// replace the hello world message with the code you want to execute when you run the command.
    }
}

```
