package com.benji.harryPoterProject.controller;

import com.benji.harryPoterProject.model.Chapter;
import com.benji.harryPoterProject.view.Console;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ChapterController {
    private Chapter chapter;

    public boolean nextChapter(boolean isChapterFinished) {
        if (chapter.isLastChapter()) {
            Console.print("You have finished the game!");
            return true;
        }
        if (isChapterFinished) {
            chapter = new Chapter(chapter.getNumber() + 1);
            return true;
        }
        return false;
    }
}
