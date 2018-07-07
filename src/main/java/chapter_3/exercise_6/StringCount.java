package chapter_3.exercise_6;

public class StringCount {

    public static int countLowerCaseLetters(String input) {
        return (int) input.chars().filter(Character::isLowerCase).count();
    }
}
