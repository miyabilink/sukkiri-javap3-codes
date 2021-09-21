import java.net.URI;
import java.net.http.*;
import java.net.http.HttpClient.*;
import com.fasterxml.jackson.databind.*;

public class Main {
  public static void main(String[] args) throws Exception {
    String url = "https://api.github.com/users/miyabilink";
    HttpClient client = HttpClient.newBuilder()
      .version(Version.HTTP_1_1)
      .followRedirects(Redirect.NORMAL)
      .build();
    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create(url))
      .header("Accept", "application/vnd.github.v3+json")
      .GET()
      .build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    String body = res.body();
    int status = res.statusCode();
    if (status == 200) {
      ObjectMapper mapper = new ObjectMapper();
      JsonNode root = mapper.readTree(body);
      String blog = root.get("blog").textValue();
      System.out.println(blog);
    } else {
      System.out.println("ERROR: " + status);
    }
  }
}
