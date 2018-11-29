package com.example.joel.inventorysystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Class_Producto extends AppCompatActivity {

    Button btnCRUDproducto;
    ImageView btnBuscarProd1;
    EditText txtProducto;

    @BindView(R.id.rvProductos)
    RecyclerView rvProductos;

    private FirebaseFirestore db;
    private FirestoreRecyclerAdapter adapter;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        btnCRUDproducto = findViewById(R.id.btnCRUDproducto);

        btnCRUDproducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irProductoCRUD();
            }
        });
        ButterKnife.bind(this);
        init();
        getFriendList();
    }

    private void init(){
        linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvProductos.setLayoutManager(linearLayoutManager);
        db = FirebaseFirestore.getInstance();
    }

    private void getFriendList(){
        Query query = db.collection("productos");

        FirestoreRecyclerOptions<ProductosResponse> response = new FirestoreRecyclerOptions.Builder<ProductosResponse>()
                .setQuery(query, ProductosResponse.class)
                .build();

        adapter = new FirestoreRecyclerAdapter<ProductosResponse, ProductosHolder>(response) {
            @Override
            public void onBindViewHolder(ProductosHolder holder, int position, ProductosResponse model) {
                holder.nombreP.setText(model.getNombre());
                holder.precioP.setText(model.getPrecio());
                holder.categoriaP.setText(model.getCategoria());
//                Glide.with(getApplicationContext())
//                        .load(model.getImage())
//                        .into(holder.imageView);

                holder.itemView.setOnClickListener(v -> {
                    Snackbar.make(rvProductos, model.getNombre()+", "+model.getPrecio()+" at "+model.getCategoria(), Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                });
            }

            @Override
            public ProductosHolder onCreateViewHolder(ViewGroup group, int i) {
                View view = LayoutInflater.from(group.getContext())
                        .inflate(R.layout.productos_item_listview, group, false);

                return new ProductosHolder(view);
            }

            @Override
            public void onError(FirebaseFirestoreException e) {
                Log.e("error", e.getMessage());
            }
        };

        adapter.notifyDataSetChanged();
        rvProductos.setAdapter(adapter);
    }

    public class ProductosHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.nombreP)
        TextView nombreP;
        @BindView(R.id.precioP)
        TextView precioP;
        @BindView(R.id.categoriaP)
        TextView categoriaP;

        public ProductosHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        adapter.stopListening();
    }

    public void irProductoCRUD(){
        Intent i = new Intent(this, Class_ProductoCRUD.class);
        startActivity(i);
    }
}
