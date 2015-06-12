package editable;

import android.os.AsyncTask;

/**
 * Created by Braxton on 10/31/2014.
 */
public abstract class RevConnection extends AsyncTask<Object, Object, Object> {

            public abstract Object doInBackground(Object... objects);
            public abstract void onPostExecute(Object result);

}
