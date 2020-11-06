package net.starype.quiz.api.game.player;

public class Score {

    private double score;

    private int answeredQuestions;
    private int correctAnsweredQuestions;

    public Score() {
        this.score = 0;
        this.answeredQuestions = 0;
        this.correctAnsweredQuestions = 0;
    }

    public double getAccuracy() {
        return (double)correctAnsweredQuestions / answeredQuestions;
    }

    public double getScore() {
        return score;
    }

    public int getAnsweredQuestions() {
        return answeredQuestions;
    }

    public int getCorrectAnsweredQuestions() {
        return correctAnsweredQuestions;
    }

    public void incrementScore(double increment) {
        this.score += increment;
    }

    public void incrementAnsweredQuestionCount(boolean isAnswerCorrect) {
        this.answeredQuestions++;
        if(isAnswerCorrect) {
            this.correctAnsweredQuestions++;
        }
    }
}
