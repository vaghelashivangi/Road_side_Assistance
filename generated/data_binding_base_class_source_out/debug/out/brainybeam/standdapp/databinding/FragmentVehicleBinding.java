// Generated by view binder compiler. Do not edit!
package brainybeam.standdapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import brainybeam.standdapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentVehicleBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView emptyimg;

  @NonNull
  public final FloatingActionButton vehicleAdd;

  @NonNull
  public final RecyclerView vehicleRecycler;

  private FragmentVehicleBinding(@NonNull FrameLayout rootView, @NonNull ImageView emptyimg,
      @NonNull FloatingActionButton vehicleAdd, @NonNull RecyclerView vehicleRecycler) {
    this.rootView = rootView;
    this.emptyimg = emptyimg;
    this.vehicleAdd = vehicleAdd;
    this.vehicleRecycler = vehicleRecycler;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentVehicleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentVehicleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_vehicle, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentVehicleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emptyimg;
      ImageView emptyimg = ViewBindings.findChildViewById(rootView, id);
      if (emptyimg == null) {
        break missingId;
      }

      id = R.id.vehicle_add;
      FloatingActionButton vehicleAdd = ViewBindings.findChildViewById(rootView, id);
      if (vehicleAdd == null) {
        break missingId;
      }

      id = R.id.vehicle_recycler;
      RecyclerView vehicleRecycler = ViewBindings.findChildViewById(rootView, id);
      if (vehicleRecycler == null) {
        break missingId;
      }

      return new FragmentVehicleBinding((FrameLayout) rootView, emptyimg, vehicleAdd,
          vehicleRecycler);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
