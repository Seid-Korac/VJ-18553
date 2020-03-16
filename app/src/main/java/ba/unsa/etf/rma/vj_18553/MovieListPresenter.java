package ba.unsa.etf.rma.vj_18553;

import android.app.Activity;
import android.content.Context;

public class MovieListPresenter {
    private Context context;
    private MovieListInteractor interactor;
//    private MovieListView/Activity view;

    public MovieListPresenter() {
        this.interactor = new MovieListInteractor();
    }
}
