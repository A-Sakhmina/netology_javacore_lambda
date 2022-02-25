package task2_worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}