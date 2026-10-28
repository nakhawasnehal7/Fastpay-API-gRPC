package fastPayAPI.ledger;

public record AccountSnapshot(String accountId, long balanceCents, String currency) {
}
