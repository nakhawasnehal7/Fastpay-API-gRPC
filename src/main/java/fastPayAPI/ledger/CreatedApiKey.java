package fastPayAPI.ledger;


import fastPayAPI.security.Role;

public record CreatedApiKey(String label, Role role, String token) {
}
