package fastPayAPI.ledger;

public record SubmitResult(PostedTransaction transaction, boolean replayed) {
}
