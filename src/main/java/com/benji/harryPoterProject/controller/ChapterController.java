package com.benji.harryPoterProject.controller;

import com.benji.harryPoterProject.model.Chapter;
import com.benji.harryPoterProject.view.Console;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChapterController {
    private Chapter chapter;

    public ChapterController() {
        chapter = new Chapter(1);
    }

    public boolean nextChapter() {
        if (chapter.isLastChapter()) {
            Console.print("\nYou have finished the game!");
            return true;
        }
        if (chapter.getBoss().getHealth() == 0) {
            chapter = new Chapter(chapter.getNumber() + 1);
            return true;
        }
        return false;
    }
}
