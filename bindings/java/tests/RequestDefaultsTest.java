import io.cloudsmith.api.models.RepositoryRequestPatch;

public class RequestDefaultsTest {
    public static void main(String[] args) throws Exception {
        String json = new RepositoryRequestPatch().description("A new description").toJson();

        if (!"{\"description\":\"A new description\"}".equals(json)) {
            throw new AssertionError("patch request was " + json);
        }
        System.out.println("RequestDefaultsTest passed");
    }
}
