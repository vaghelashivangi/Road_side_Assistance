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

public final class ActivitySignupBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView signupGetOtp;

  @NonNull
  public final EditText signupMobile;

  @NonNull
  public final EditText signupName;

  @NonNull
  public final EditText signupOtp1;

  @NonNull
  public final EditText signupOtp2;

  @NonNull
  public final EditText signupOtp3;

  @NonNull
  public final EditText signupOtp4;

  @NonNull
  public final EditText signupOtp5;

  @NonNull
  public final EditText signupOtp6;

  @NonNull
  public final EditText signupPassword;

  @NonNull
  public final TextView signupSubmit;

  private ActivitySignupBinding(@NonNull LinearLayout rootView, @NonNull TextView signupGetOtp,
      @NonNull EditText signupMobile, @NonNull EditText signupName, @NonNull EditText signupOtp1,
      @NonNull EditText signupOtp2, @NonNull EditText signupOtp3, @NonNull EditText signupOtp4,
      @NonNull EditText signupOtp5, @NonNull EditText signupOtp6, @NonNull EditText signupPassword,
      @NonNull TextView signupSubmit) {
    this.rootView = rootView;
    this.signupGetOtp = signupGetOtp;
    this.signupMobile = signupMobile;
    this.signupName = signupName;
    this.signupOtp1 = signupOtp1;
    this.signupOtp2 = signupOtp2;
    this.signupOtp3 = signupOtp3;
    this.signupOtp4 = signupOtp4;
    this.signupOtp5 = signupOtp5;
    this.signupOtp6 = signupOtp6;
    this.signupPassword = signupPassword;
    this.signupSubmit = signupSubmit;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.signup_get_otp;
      TextView signupGetOtp = ViewBindings.findChildViewById(rootView, id);
      if (signupGetOtp == null) {
        break missingId;
      }

      id = R.id.signup_mobile;
      EditText signupMobile = ViewBindings.findChildViewById(rootView, id);
      if (signupMobile == null) {
        break missingId;
      }

      id = R.id.signup_name;
      EditText signupName = ViewBindings.findChildViewById(rootView, id);
      if (signupName == null) {
        break missingId;
      }

      id = R.id.signup_otp_1;
      EditText signupOtp1 = ViewBindings.findChildViewById(rootView, id);
      if (signupOtp1 == null) {
        break missingId;
      }

      id = R.id.signup_otp_2;
      EditText signupOtp2 = ViewBindings.findChildViewById(rootView, id);
      if (signupOtp2 == null) {
        break missingId;
      }

      id = R.id.signup_otp_3;
      EditText signupOtp3 = ViewBindings.findChildViewById(rootView, id);
      if (signupOtp3 == null) {
        break missingId;
      }

      id = R.id.signup_otp_4;
      EditText signupOtp4 = ViewBindings.findChildViewById(rootView, id);
      if (signupOtp4 == null) {
        break missingId;
      }

      id = R.id.signup_otp_5;
      EditText signupOtp5 = ViewBindings.findChildViewById(rootView, id);
      if (signupOtp5 == null) {
        break missingId;
      }

      id = R.id.signup_otp_6;
      EditText signupOtp6 = ViewBindings.findChildViewById(rootView, id);
      if (signupOtp6 == null) {
        break missingId;
      }

      id = R.id.signup_password;
      EditText signupPassword = ViewBindings.findChildViewById(rootView, id);
      if (signupPassword == null) {
        break missingId;
      }

      id = R.id.signup_submit;
      TextView signupSubmit = ViewBindings.findChildViewById(rootView, id);
      if (signupSubmit == null) {
        break missingId;
      }

      return new ActivitySignupBinding((LinearLayout) rootView, signupGetOtp, signupMobile,
          signupName, signupOtp1, signupOtp2, signupOtp3, signupOtp4, signupOtp5, signupOtp6,
          signupPassword, signupSubmit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
