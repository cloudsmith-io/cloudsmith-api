import io.cloudsmith.api.models.NamespaceAuditLog;
import io.cloudsmith.api.models.Repository;

public class ForwardCompatibilityTest {
    public static void main(String[] args) throws Exception {
        String unknownValue = "A value added after this release";
        Repository repository = Repository.fromJson(
            "{\"name\": \"my-repo\", \"broadcast_state\": \"" + unknownValue + "\"}");

        if (!unknownValue.equals(String.valueOf(repository.getBroadcastState()))) {
            throw new AssertionError("broadcast_state was " + repository.getBroadcastState());
        }

        NamespaceAuditLog auditLog = NamespaceAuditLog.fromJson(
            "{\"actor\": null, \"actor_location\": null, \"context\": \"\", \"event\": \"action.login\"}");
        if (auditLog.getActorLocation() != null || !"".equals(auditLog.getContext())) {
            throw new AssertionError("audit log was " + auditLog.toJson());
        }
        System.out.println("ForwardCompatibilityTest passed");
    }
}
