// Generated by view binder compiler. Do not edit!
package brainybeam.standdapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public final class ActivityServiceChargeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText serviceChargeAccidentCharge;

  @NonNull
  public final EditText serviceChargeBetteryJumpCharge;

  @NonNull
  public final EditText serviceChargeClutchBreakCharge;

  @NonNull
  public final EditText serviceChargeFuelProblemCharge;

  @NonNull
  public final EditText serviceChargeLostKeyCharge;

  @NonNull
  public final EditText serviceChargeOtherCharge;

  @NonNull
  public final TextView serviceChargeSubmit;

  @NonNull
  public final EditText serviceChargeTowingCharge;

  @NonNull
  public final EditText serviceChargeTyreDamageCharge;

  private ActivityServiceChargeBinding(@NonNull LinearLayout rootView,
      @NonNull EditText serviceChargeAccidentCharge,
      @NonNull EditText serviceChargeBetteryJumpCharge,
      @NonNull EditText serviceChargeClutchBreakCharge,
      @NonNull EditText serviceChargeFuelProblemCharge,
      @NonNull EditText serviceChargeLostKeyCharge, @NonNull EditText serviceChargeOtherCharge,
      @NonNull TextView serviceChargeSubmit, @NonNull EditText serviceChargeTowingCharge,
      @NonNull EditText serviceChargeTyreDamageCharge) {
    this.rootView = rootView;
    this.serviceChargeAccidentCharge = serviceChargeAccidentCharge;
    this.serviceChargeBetteryJumpCharge = serviceChargeBetteryJumpCharge;
    this.serviceChargeClutchBreakCharge = serviceChargeClutchBreakCharge;
    this.serviceChargeFuelProblemCharge = serviceChargeFuelProblemCharge;
    this.serviceChargeLostKeyCharge = serviceChargeLostKeyCharge;
    this.serviceChargeOtherCharge = serviceChargeOtherCharge;
    this.serviceChargeSubmit = serviceChargeSubmit;
    this.serviceChargeTowingCharge = serviceChargeTowingCharge;
    this.serviceChargeTyreDamageCharge = serviceChargeTyreDamageCharge;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityServiceChargeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityServiceChargeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_service_charge, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityServiceChargeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.service_charge_accident_charge;
      EditText serviceChargeAccidentCharge = ViewBindings.findChildViewById(rootView, id);
      if (serviceChargeAccidentCharge == null) {
        break missingId;
      }

      id = R.id.service_charge_bettery_jump_charge;
      EditText serviceChargeBetteryJumpCharge = ViewBindings.findChildViewById(rootView, id);
      if (serviceChargeBetteryJumpCharge == null) {
        break missingId;
      }

      id = R.id.service_charge_clutch_break_charge;
      EditText serviceChargeClutchBreakCharge = ViewBindings.findChildViewById(rootView, id);
      if (serviceChargeClutchBreakCharge == null) {
        break missingId;
      }

      id = R.id.service_charge_fuel_problem_charge;
      EditText serviceChargeFuelProblemCharge = ViewBindings.findChildViewById(rootView, id);
      if (serviceChargeFuelProblemCharge == null) {
        break missingId;
      }

      id = R.id.service_charge_lost_key_charge;
      EditText serviceChargeLostKeyCharge = ViewBindings.findChildViewById(rootView, id);
      if (serviceChargeLostKeyCharge == null) {
        break missingId;
      }

      id = R.id.service_charge_other_charge;
      EditText serviceChargeOtherCharge = ViewBindings.findChildViewById(rootView, id);
      if (serviceChargeOtherCharge == null) {
        break missingId;
      }

      id = R.id.service_charge_submit;
      TextView serviceChargeSubmit = ViewBindings.findChildViewById(rootView, id);
      if (serviceChargeSubmit == null) {
        break missingId;
      }

      id = R.id.service_charge_towing_charge;
      EditText serviceChargeTowingCharge = ViewBindings.findChildViewById(rootView, id);
      if (serviceChargeTowingCharge == null) {
        break missingId;
      }

      id = R.id.service_charge_tyre_damage_charge;
      EditText serviceChargeTyreDamageCharge = ViewBindings.findChildViewById(rootView, id);
      if (serviceChargeTyreDamageCharge == null) {
        break missingId;
      }

      return new ActivityServiceChargeBinding((LinearLayout) rootView, serviceChargeAccidentCharge,
          serviceChargeBetteryJumpCharge, serviceChargeClutchBreakCharge,
          serviceChargeFuelProblemCharge, serviceChargeLostKeyCharge, serviceChargeOtherCharge,
          serviceChargeSubmit, serviceChargeTowingCharge, serviceChargeTyreDamageCharge);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
