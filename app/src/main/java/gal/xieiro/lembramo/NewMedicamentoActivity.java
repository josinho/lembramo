package gal.xieiro.lembramo;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import gal.xieiro.lembramo.ui.ImageSelector;


public class NewMedicamentoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // usar un aspa como forma de retroceder a la anterior activity
        // simulando un cancelar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_clear_white_24dp);


        // poner imágenes por defecto
        ((ImageSelector)findViewById(R.id.imagenCaja)).setImageResource(R.drawable.caja);
        ((ImageSelector)findViewById(R.id.imagenPastilla)).setImageResource(R.drawable.pastilla);
    }

    @Override
    protected int getLayoutResource() {
        // indicar el layout de esta activity, necesario para BaseActivity
        return R.layout.activity_new_medicamento;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_medicamento, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}