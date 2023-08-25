package me.yacinehamza111.reflectapi.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

/*
 * This Class is deprecated and might be removed.
 */

@Deprecated
public class ReflectScoreboard {

    public String title;
    public String displayTitle;
    public String[] lines;

    public ReflectScoreboard() {

    }

    public ReflectScoreboard(String title, String... lines) {
        this.title = title;
        this.lines = lines;
    }

    public ReflectScoreboard(String title, String displayTitle, String... lines) {
        this.title = title;
        this.displayTitle = displayTitle;
        this.lines = lines;
    }

    public ReflectScoreboard(String title, String displayTitle) {
        this.title = title;
        this.displayTitle = displayTitle;
    }

    public void addScoreboard(Player player) {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getMainScoreboard();
        Objective objective = board.registerNewObjective(title.toLowerCase(), Criteria.DUMMY, displayTitle);

        for (int i = 0; i < lines.length; i++) {
            Score score = objective.getScore(Color.color(lines[i]));
            score.setScore(i);
        }

        player.setScoreboard(board);
    }

    public String getTitle() {
        return title;
    }

    public String getDisplayTitle() {
        return displayTitle;
    }

    public String[] getLines() {
        return lines;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
    }

    public void setLines(String... lines) {
        this.lines = lines;
    }
}
