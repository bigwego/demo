import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> whatsyourname = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "name";
        });

        CompletableFuture<String> greeting = whatsyourname.thenApply(n -> {
            return "Hello " + n;
        });

        System.out.println(greeting.get());
    }
}
