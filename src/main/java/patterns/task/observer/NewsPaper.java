package patterns.task.observer;

import java.time.LocalDate;

/**
 * Created by Yuliia Tesliuk on 11/13/2018
 */
public class NewsPaper {
    private int issueNumber;
    private LocalDate releaseDate;
    private String theme;
    private String content;

    public NewsPaper(int issueNumber, LocalDate releaseDate, String theme, String content) {
        this.issueNumber = issueNumber;
        this.releaseDate = releaseDate;
        this.theme = theme;
        this.content = content;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getTheme() {
        return theme;
    }

    public String getContent() {
        return content;
    }
}
