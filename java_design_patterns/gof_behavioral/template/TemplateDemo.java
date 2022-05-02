package java_design_patterns.gof_behavioral.template;

public class TemplateDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();

    }
}