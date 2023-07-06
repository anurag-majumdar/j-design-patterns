package behavioural_patterns.template_method.Ex1;

public abstract class J {
    public void execute() {
        this.onInit();
        System.out.println("On Execution");
        this.onDestroy();
    }

    public void onInit() {
        System.out.println("While Initialize.");
    }

    public void onDestroy() {
        System.out.println("While Destroy.");
    }
}
