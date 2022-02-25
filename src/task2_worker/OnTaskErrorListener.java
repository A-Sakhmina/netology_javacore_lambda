package task2_worker;


@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
