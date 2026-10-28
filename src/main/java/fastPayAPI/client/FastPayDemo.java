package fastPayAPI.client;

/**
 * Starts the gRPC server if needed, runs the sample client, then shuts down
 * any server this p rocess started.
 */
public final class FastPayDemo {
    public static void main(String[] args) throws Exception {
        FastPayClient.main(args);
    }
}
