package cr.ac.itcr.tarea3;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;


/**
 * Created by car_e on 4/13/2016.
 */
public class ContactAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;

    protected Activity activity;
    protected ArrayList<Contacto> items;
    public ContactAdapter(Context context, ArrayList<Contacto> items) {
        this.context = context;
        this.items = items;
    }
    @Override
    public int getCount() {
        return items.size();
    }
    @Override
    public Object getItem(int arg0) {
        return items.get(arg0);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView txtNombre;
        TextView txtNumero;
        TextView txtTipo;
        TextView txtId;
        ImageView imgImg;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.fragment_item, parent, false);

        txtId = (TextView) itemView.findViewById(R.id.txtId);
        txtNombre = (TextView) itemView.findViewById(R.id.txtNombre);
        txtNumero = (TextView) itemView.findViewById(R.id.txtNumero);
        txtTipo = (TextView) itemView.findViewById(R.id.txtTipo);
        imgImg = (ImageView) itemView.findViewById(R.id.imageView);

        imgImg.setImageDrawable(context.getResources().getDrawable(R.drawable.contact));
        txtId.setText(String.valueOf(items.get(position).getId()));
        txtNombre.setText(txtNombre.getText() + items.get(position).getNombre());
        txtNumero.setText(txtNumero.getText() + items.get(position).getNumero());
        txtTipo.setText(txtTipo.getText() + items.get(position).getTipo());

        return itemView;
    }
}
