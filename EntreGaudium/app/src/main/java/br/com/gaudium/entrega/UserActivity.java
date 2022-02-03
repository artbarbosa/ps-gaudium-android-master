package br.com.gaudium.entrega;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

import androidx.core.content.ContextCompat;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class UserActivity extends FragmentActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acti);
		// Obtain the SupportMapFragment and get notified when the map is ready to be used.
		SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.map);

		if (mapFragment == null) return;

		handler = new Handler();
		layMenu = findViewById(R.id.layMenu);

		// Menu de Oferta
		layMenuOferta = findViewById(R.id.layMenuOferta);
		txtEnderecoOferta = findViewById(R.id.txtEnderecoOferta);
		btnRejeitar = findViewById(R.id.btnRejeitar);
		btnRejeitar.setOnClickListener(view -> onReject());
		btnAceitar = findViewById(R.id.btnAceitar);
		btnAceitar.setOnClickListener(view -> onAccept());

		// Menu de Coleta
		layMenuColeta = findViewById(R.id.layMenuColeta);
		layColetaButton = findViewById(R.id.layColetaButton);
		txtEnderecoColeta = findViewById(R.id.txtEnderecoColeta);
		txtEntrega = findViewById(R.id.txtEntrega);
		btnColetar = findViewById(R.id.btnColetar);
		btnColetar.setOnClickListener(view -> onCollect());

		// Menu de Entrega
		layMenuEntrega = findViewById(R.id.layMenuEntrega);
		layEntregaButton = findViewById(R.id.layEntregaButton);
		txtEnderecoOferta = findViewById(R.id.txtEnderecoOferta);
		btnEntregar = findViewById(R.id.btnEntregar);
		btnEntregar.setOnClickListener(view -> onDeliver());


		btnDebugAction = findViewById(R.id.btnDebugAction);
		btnDebugAction.setOnClickListener(view -> onDebugAction());

		// Preparar e carregar mapa
		mapFragment.getMapAsync(this);

		entregadorObj = EntregadorObj.getInstance();

		dLocRet = new DebugLocationRetriever();
		dLocRet.setLatLng(-22.904093, -43.175293);
	}

}