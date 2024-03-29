package orangeit.com.retrofitdemo;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface GithubUserAPI {
    String ENDPOINT = "https://api.github.com";

    @GET("/users/{user}")
    Call<GithubUser> getUser(@Path("user") String user);
}
