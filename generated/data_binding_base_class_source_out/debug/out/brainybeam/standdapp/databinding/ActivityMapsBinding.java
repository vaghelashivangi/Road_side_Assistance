// Generated by view binder compiler. Do not edit!
package brainybeam.standdapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import brainybeam.standdapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMapsBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final RelativeLayout contentMainTabLayout;

  @NonNull
  public final TextView mapAddress;

  @NonNull
  public final ImageView mapBack;

  @NonNull
  public final CardView mapBottom;

  @NonNull
  public final LinearLayout mapBottomSub;

  @NonNull
  public final ImageView mapCall;

  @NonNull
  public final CardView mapLocation;

  @NonNull
  public final AutoCompleteTextView mapMakeModel;

  @NonNull
  public final EditText mapOther;

  @NonNull
  public final RecyclerView mapRecycle;

  @NonNull
  public final EditText mapRegistrationNo;

  @NonNull
  public final TextView mapSubmit;

  @NonNull
  public final RadioButton mapType2w;

  @NonNull
  public final RadioButton mapType4w;

  @NonNull
  public final RadioButton mapTypeCv;

  @NonNull
  public final RadioGroup mapTypeRg;

  private ActivityMapsBinding(@NonNull FrameLayout rootView,
      @NonNull RelativeLayout contentMainTabLayout, @NonNull TextView mapAddress,
      @NonNull ImageView mapBack, @NonNull CardView mapBottom, @NonNull LinearLayout mapBottomSub,
      @NonNull ImageView mapCall, @NonNull CardView mapLocation,
      @NonNull AutoCompleteTextView mapMakeModel, @NonNull EditText mapOther,
      @NonNull RecyclerView mapRecycle, @NonNull EditText mapRegistrationNo,
      @NonNull TextView mapSubmit, @NonNull RadioButton mapType2w, @NonNull RadioButton mapType4w,
      @NonNull RadioButton mapTypeCv, @NonNull RadioGroup mapTypeRg) {
    this.rootView = rootView;
    this.contentMainTabLayout = contentMainTabLayout;
    this.mapAddress = mapAddress;
    this.mapBack = mapBack;
    this.mapBottom = mapBottom;
    this.mapBottomSub = mapBottomSub;
    this.mapCall = mapCall;
    this.mapLocation = mapLocation;
    this.mapMakeModel = mapMakeModel;
    this.mapOther = mapOther;
    this.mapRecycle = mapRecycle;
    this.mapRegistrationNo = mapRegistrationNo;
    this.mapSubmit = mapSubmit;
    this.mapType2w = mapType2w;
    this.mapType4w = mapType4w;
    this.mapTypeCv = mapTypeCv;
    this.mapTypeRg = mapTypeRg;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_maps, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMapsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.content_main_tab_layout;
      RelativeLayout contentMainTabLayout = ViewBindings.findChildViewById(rootView, id);
      if (contentMainTabLayout == null) {
        break missingId;
      }

      id = R.id.map_address;
      TextView mapAddress = ViewBindings.findChildViewById(rootView, id);
      if (mapAddress == null) {
        break missingId;
      }

      id = R.id.map_back;
      ImageView mapBack = ViewBindings.findChildViewById(rootView, id);
      if (mapBack == null) {
        break missingId;
      }

      id = R.id.map_bottom;
      CardView mapBottom = ViewBindings.findChildViewById(rootView, id);
      if (mapBottom == null) {
        break missingId;
      }

      id = R.id.map_bottom_sub;
      LinearLayout mapBottomSub = ViewBindings.findChildViewById(rootView, id);
      if (mapBottomSub == null) {
        break missingId;
      }

      id = R.id.map_call;
      ImageView mapCall = ViewBindings.findChildViewById(rootView, id);
      if (mapCall == null) {
        break missingId;
      }

      id = R.id.map_location;
      CardView mapLocation = ViewBindings.findChildViewById(rootView, id);
      if (mapLocation == null) {
        break missingId;
      }

      id = R.id.map_make_model;
      AutoCompleteTextView mapMakeModel = ViewBindings.findChildViewById(rootView, id);
      if (mapMakeModel == null) {
        break missingId;
      }

      id = R.id.map_other;
      EditText mapOther = ViewBindings.findChildViewById(rootView, id);
      if (mapOther == null) {
        break missingId;
      }

      id = R.id.map_recycle;
      RecyclerView mapRecycle = ViewBindings.findChildViewById(rootView, id);
      if (mapRecycle == null) {
        break missingId;
      }

      id = R.id.map_registration_no;
      EditText mapRegistrationNo = ViewBindings.findChildViewById(rootView, id);
      if (mapRegistrationNo == null) {
        break missingId;
      }

      id = R.id.map_submit;
      TextView mapSubmit = ViewBindings.findChildViewById(rootView, id);
      if (mapSubmit == null) {
        break missingId;
      }

      id = R.id.map_type_2w;
      RadioButton mapType2w = ViewBindings.findChildViewById(rootView, id);
      if (mapType2w == null) {
        break missingId;
      }

      id = R.id.map_type_4w;
      RadioButton mapType4w = ViewBindings.findChildViewById(rootView, id);
      if (mapType4w == null) {
        break missingId;
      }

      id = R.id.map_type_cv;
      RadioButton mapTypeCv = ViewBindings.findChildViewById(rootView, id);
      if (mapTypeCv == null) {
        break missingId;
      }

      id = R.id.map_type_rg;
      RadioGroup mapTypeRg = ViewBindings.findChildViewById(rootView, id);
      if (mapTypeRg == null) {
        break missingId;
      }

      return new ActivityMapsBinding((FrameLayout) rootView, contentMainTabLayout, mapAddress,
          mapBack, mapBottom, mapBottomSub, mapCall, mapLocation, mapMakeModel, mapOther,
          mapRecycle, mapRegistrationNo, mapSubmit, mapType2w, mapType4w, mapTypeCv, mapTypeRg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
