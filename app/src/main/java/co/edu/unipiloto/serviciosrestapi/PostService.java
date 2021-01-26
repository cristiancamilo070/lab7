package co.edu.unipiloto.serviciosrestapi;

import java.util.List;

import  retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PostService {

    String API_ROUTE = "/posts";
    String API_ROUTE_ID= "posts/{id}";
    @GET(API_ROUTE)
    Call<List<Post>> getPost();


    @GET(API_ROUTE_ID)
    Call<Post> getPostId(@Path("id") int id);

    @POST("/posts/new")
    Call<Post> addPost(@Body Post post);

}
