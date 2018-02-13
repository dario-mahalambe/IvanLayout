package dario.mahalambe.ivanlayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dario Mahalambe on 11/02/2018.
 */

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder> {


    private List<Movie> movieList = new ArrayList<>();

    public MovieListAdapter() {

        //Dummy Movie Data

        movieList.add(new Movie("Arrow", R.drawable.serie_arrow));
        movieList.add(new Movie("The Flash", R.drawable.serie_the_flash));
        movieList.add(new Movie("Arrow", R.drawable.serie_arrow));
        movieList.add(new Movie("The Flash", R.drawable.serie_the_flash));
        movieList.add(new Movie("Arrow", R.drawable.serie_arrow));
        movieList.add(new Movie("The Flash", R.drawable.serie_the_flash));
        movieList.add(new Movie("Arrow", R.drawable.serie_arrow));
        movieList.add(new Movie("The Flash", R.drawable.serie_the_flash));

    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);

        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie movie = movieList.get(position);

        holder.textViewTitle.setText(movie.getTitle());

        holder.imageView.setImageResource(movie.getImg_resource());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder {


        ImageView imageView;
        TextView textViewTitle;


        public MovieViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_movie);
            textViewTitle = itemView.findViewById(R.id.tv_title);

        }
    }

}
