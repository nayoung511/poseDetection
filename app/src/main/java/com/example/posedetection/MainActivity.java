package com.example.posedetection;

import android.animation.AnimatorSet;
import android.media.Image;
import android.os.Bundle;

import com.example.posedetection.camera.CameraSourcePreview;
import com.example.posedetection.camera.GraphicOverlay;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.posedetection.databinding.ActivityMainBinding;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.pose.PoseDetection;
import com.google.mlkit.vision.pose.PoseDetector;
import com.google.mlkit.vision.pose.accurate.AccuratePoseDetectorOptions;
import com.google.mlkit.vision.pose.defaults.PoseDetectorOptions;
import com.example.posedetection.camera.CameraSource;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity{

    private CameraSource cameraSource;
    private CameraSourcePreview preview;
    private GraphicOverlay graphicOverlay;
    private ExtendedFloatingActionButton searchButton;
    private AnimatorSet searchButtonAnimator;
    private Chip promptChip;
    private AnimatorSet promptChipAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        preview = findViewById(R.id.camera_preview);
        graphicOverlay = findViewById(R.id.camera_preview_graphic_overlay);
        }



    }


}











