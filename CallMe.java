public class CallMe {

    synchronized public void call(String msg) {

        System.out.print(msg);
        try {
            Thread.sleep(1000);
        } catch (Exception _) {
        }
        System.out.print(" ");
    }

}