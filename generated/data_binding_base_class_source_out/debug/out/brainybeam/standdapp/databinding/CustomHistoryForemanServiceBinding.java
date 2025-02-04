// Generated by view binder compiler. Do not edit!
package brainybeam.standdapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import brainybeam.standdapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomHistoryForemanServiceBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView customHistoryForemanServiceAddress;

  @NonNull
  public final TextView customHistoryForemanServiceCharge;

  @NonNull
  public final TextView customHistoryForemanServiceDate;

  @NonNull
  public final TextView customHistoryForemanServiceId;

  @NonNull
  public final ImageView customHistoryForemanServiceIv;

  @NonNull
  public final TextView customHistoryForemanServiceName;

  @NonNull
  public final TextView customHistoryForemanServiceRegistration;

  @NonNull
  public final TextView customHistoryForemanServiceService;

  @NonNull
  public final TextView customHistoryForemanServiceStatus;

  private CustomHistoryForemanServiceBinding(@NonNull LinearLayout rootView,
      @NonNull TextView customHistoryForemanServiceAddress,
      @NonNull TextView customHistoryForemanServiceCharge,
      @NonNull TextView customHistoryForemanServiceDate,
      @NonNull TextView customHistoryForemanServiceId,
      @NonNull ImageView customHistoryForemanServiceIv,
      @NonNull TextView customHistoryForemanServiceName,
      @NonNull TextView customHistoryForemanServiceRegistration,
      @NonNull TextView customHistoryForemanServiceService,
      @NonNull TextView customHistoryForemanServiceStatus) {
    this.rootView = rootView;
    this.customHistoryForemanServiceAddress = customHistoryForemanServiceAddress;
    this.customHistoryForemanServiceCharge = customHistoryForemanServiceCharge;
    this.customHistoryForemanServiceDate = customHistoryForemanServiceDate;
    this.customHistoryForemanServiceId = customHistoryForemanServiceId;
    this.customHistoryForemanServiceIv = customHistoryForemanServiceIv;
    this.customHistoryForemanServiceName = customHistoryForemanServiceName;
    this.customHistoryForemanServiceRegistration = customHistoryForemanServiceRegistration;
    this.customHistoryForemanServiceService = customHistoryForemanServiceService;
    this.customHistoryForemanServiceStatus = customHistoryForemanServiceStatus;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomHistoryForemanServiceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomHistoryForemanServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_history_foreman_service, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomHistoryForemanServiceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.custom_history_foreman_service_address;
      TextView customHistoryForemanServiceAddress = ViewBindings.findChildViewById(rootView, id);
      if (customHistoryForemanServiceAddress == null) {
        break missingId;
      }

      id = R.id.custom_history_foreman_service_charge;
      TextView customHistoryForemanServiceCharge = ViewBindings.findChildViewById(rootView, id);
      if (customHistoryForemanServiceCharge == null) {
        break missingId;
      }

      id = R.id.custom_history_foreman_service_date;
      TextView customHistoryForemanServiceDate = ViewBindings.findChildViewById(rootView, id);
      if (customHistoryForemanServiceDate == null) {
        break missingId;
      }

      id = R.id.custom_history_foreman_service_id;
      TextView customHistoryForemanServiceId = ViewBindings.findChildViewById(rootView, id);
      if (customHistoryForemanServiceId == null) {
        break missingId;
      }

      id = R.id.custom_history_foreman_service_iv;
      ImageView customHistoryForemanServiceIv = ViewBindings.findChildViewById(rootView, id);
      if (customHistoryForemanServiceIv == null) {
        break missingId;
      }

      id = R.id.custom_history_foreman_service_name;
      TextView customHistoryForemanServiceName = ViewBindings.findChildViewById(rootView, id);
      if (customHistoryForemanServiceName == null) {
        break missingId;
      }

      id = R.id.custom_history_foreman_service_registration;
      TextView customHistoryForemanServiceRegistration = ViewBindings.findChildViewById(rootView, id);
      if (customHistoryForemanServiceRegistration == null) {
        break missingId;
      }

      id = R.id.custom_history_foreman_service_service;
      TextView customHistoryForemanServiceService = ViewBindings.findChildViewById(rootView, id);
      if (customHistoryForemanServiceService == null) {
        break missingId;
      }

      id = R.id.custom_history_foreman_service_status;
      TextView customHistoryForemanServiceStatus = ViewBindings.findChildViewById(rootView, id);
      if (customHistoryForemanServiceStatus == null) {
        break missingId;
      }

      return new CustomHistoryForemanServiceBinding((LinearLayout) rootView,
          customHistoryForemanServiceAddress, customHistoryForemanServiceCharge,
          customHistoryForemanServiceDate, customHistoryForemanServiceId,
          customHistoryForemanServiceIv, customHistoryForemanServiceName,
          customHistoryForemanServiceRegistration, customHistoryForemanServiceService,
          customHistoryForemanServiceStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
