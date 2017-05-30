package com.fimi.soul.module.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.utils.v;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.manager.k;
import com.fimi.soul.biz.manager.o;
import com.fimi.soul.entity.Setting;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.utils.ao;
import java.util.List;

public class i extends BaseAdapter implements com.fimi.kernel.view.button.SwitchButton.a {
    public static final String b = "100";
    public c a;
    private Context c;
    private List<Setting> d;
    private com.fimi.soul.drone.a e;
    private b f;
    private com.fimi.soul.module.update.a.b g = ((com.fimi.soul.module.update.a.b) com.fimi.kernel.c.c().a(com.fimi.soul.module.update.b.w, com.fimi.soul.module.update.a.b.class));
    private k h;
    private a i;

    public interface a {
        void b();
    }

    public interface b {
        void a(SwitchButton switchButton);
    }

    public interface c {
        void a(int i);
    }

    public enum d {
        FLIGHT,
        CONNECT_PLANE,
        FIMWARE_UPDATE,
        COMPASS_CALIBRATION,
        NEW_HAND_GUIDE,
        NEW_HAND_MODE,
        GPS_MODE,
        OPTICAL_FLOW_MODE,
        FORCED_ATTITUDE_MODE,
        SHOW_MORE_PAT,
        REMOTE,
        CALIBRATION_REMOTE,
        SWITCH_REMOTE_MODE,
        RELAY_WIFI_CONFIGURE,
        PAIR_REMOTE,
        SWITCH_RIGHT_MODE,
        BATTERY,
        BATTERY_INFO,
        GIMBAL,
        GIMBAL_CALIBRATION,
        CAMERA,
        CAMERA_SETTING,
        MAP,
        SATELLITE_MAP,
        MAP_CODE_CORREECTION,
        ACCOUNT,
        FLIGHT_RECORD,
        FLIGHT_INFO,
        USER_FEEDBACK,
        ABOUT,
        HISTORY_MESSAGE,
        XIAOMI_ACCOUNT,
        BOTTOM_EDGE_LABLE
    }

    private class e {
        TextView a;
        ImageView b;
        TextView c;
        TextView d;
        TextView e;
        ImageView f;
        TextView g;
        ImageView h;
        RelativeLayout i;
        SwitchButton j;
        TextView k;
        final /* synthetic */ i l;

        private e(i iVar) {
            this.l = iVar;
        }

        public View a(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(this.l.c).inflate(R.layout.adapt_setting, viewGroup, false);
            this.i = (RelativeLayout) inflate.findViewById(R.id.rl);
            this.a = (TextView) inflate.findViewById(R.id.setting_title_tv);
            this.b = (ImageView) inflate.findViewById(R.id.general_setting_iv);
            this.c = (TextView) inflate.findViewById(R.id.settig_coontent_tv);
            this.f = (ImageView) inflate.findViewById(R.id.setting_more_iv);
            this.d = (TextView) inflate.findViewById(R.id.switch_manul_tv);
            this.e = (TextView) inflate.findViewById(R.id.switch_manul_child_tv);
            this.g = (TextView) inflate.findViewById(R.id.setting_delcare);
            this.h = (ImageView) inflate.findViewById(R.id.setting_point);
            this.j = (SwitchButton) inflate.findViewById(R.id.switch_btn);
            this.k = (TextView) inflate.findViewById(R.id.btn_set_model);
            ao.a(this.l.c.getAssets(), this.a, this.c, this.g, this.d, this.e, this.k);
            return inflate;
        }
    }

    public i(Context context, com.fimi.soul.drone.a aVar) {
        this.c = context;
        this.e = aVar;
        this.h = k.a(context);
    }

    private void a(e eVar, LayoutParams layoutParams) {
        eVar.i.setBackgroundResource(R.drawable.list_setting_selector);
        eVar.a.setVisibility(4);
        eVar.f.setVisibility(4);
        eVar.b.setVisibility(4);
        eVar.j.setVisibility(4);
        eVar.h.setVisibility(8);
        eVar.g.setVisibility(4);
        eVar.d.setVisibility(4);
        eVar.e.setVisibility(4);
        eVar.c.setTextColor(this.c.getResources().getColor(R.color.setting_content));
        eVar.d.setTextColor(this.c.getResources().getColor(R.color.setting_content));
        eVar.e.setTextColor(this.c.getResources().getColor(R.color.setting_content_child));
        eVar.g.setTextColor(this.c.getResources().getColor(R.color.setting_declare));
        eVar.b.setAlpha(1.0f);
        eVar.j.setAlpha(1.0f);
        eVar.f.setAlpha(1.0f);
        layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.setting_adapt_height);
        eVar.i.setLayoutParams(layoutParams);
    }

    public void a(int i, View view) {
        if (view != null && (view.getTag() instanceof e)) {
            ((e) view.getTag()).g.setText(((Setting) this.d.get(i)).getContent());
        }
    }

    public void a(View view, boolean z) {
        SwitchButton switchButton;
        if (((Integer) view.getTag()).intValue() == d.SATELLITE_MAP.ordinal()) {
            if (o.a(this.c).e()) {
                o.a(this.c).f(false);
                PreferenceManager.getDefaultSharedPreferences(this.c).edit().putInt(com.fimi.soul.drone.g.c.s, 1).commit();
            } else {
                o.a(this.c).f(true);
                PreferenceManager.getDefaultSharedPreferences(this.c).edit().putInt(com.fimi.soul.drone.g.c.s, 2).commit();
            }
        }
        if (((Integer) view.getTag()).intValue() == d.SHOW_MORE_PAT.ordinal()) {
            if (com.fimi.kernel.c.e().d()) {
                com.fimi.kernel.c.e().a(false);
            } else {
                com.fimi.kernel.c.e().a(true);
            }
            ((FlightActivity) this.c).h();
        }
        if (((Integer) view.getTag()).intValue() == d.NEW_HAND_MODE.ordinal()) {
            this.f.a((SwitchButton) view.findViewWithTag(view.getTag()));
        }
        if (((Integer) view.getTag()).intValue() == d.FORCED_ATTITUDE_MODE.ordinal()) {
            switchButton = (SwitchButton) view.findViewWithTag(view.getTag());
            if (((Setting) this.d.get(d.FORCED_ATTITUDE_MODE.ordinal())).getIsOPen().booleanValue()) {
                switchButton.a(true, false);
            } else {
                switchButton.a(false, false);
            }
            if (!((Setting) this.d.get(d.NEW_HAND_MODE.ordinal())).getIsOPen().booleanValue()) {
                this.a.a(4);
                notifyDataSetChanged();
            } else {
                return;
            }
        }
        if (((Integer) view.getTag()).intValue() == d.OPTICAL_FLOW_MODE.ordinal()) {
            switchButton = (SwitchButton) view.findViewWithTag(view.getTag());
            if (((Setting) this.d.get(d.OPTICAL_FLOW_MODE.ordinal())).getIsOPen().booleanValue()) {
                switchButton.a(true, false);
            } else {
                switchButton.a(false, false);
            }
            this.a.a(2);
        }
        if (((Integer) view.getTag()).intValue() == d.MAP_CODE_CORREECTION.ordinal()) {
            SharedPreferences a = v.a(this.e.d).a();
            com.fimi.soul.biz.n.a a2 = com.fimi.soul.biz.n.a.a();
            if (a.getBoolean(com.fimi.soul.drone.g.c.bN, false)) {
                a.edit().putBoolean(com.fimi.soul.drone.g.c.bN, false).commit();
                a2.a(true);
                return;
            }
            a.edit().putBoolean(com.fimi.soul.drone.g.c.bN, true).commit();
            a2.a(false);
        }
    }

    public void a(a aVar) {
        this.i = aVar;
    }

    public void a(b bVar) {
        this.f = bVar;
    }

    public void a(c cVar) {
        this.a = cVar;
    }

    public void a(List<Setting> list) {
        this.d = list;
        notifyDataSetChanged();
    }

    public int getCount() {
        return d.values().length;
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        e eVar;
        if (view == null) {
            e eVar2 = new e();
            view = eVar2.a(viewGroup);
            view.setTag(eVar2);
            eVar = eVar2;
        } else {
            eVar = (e) view.getTag();
        }
        if (this.d != null) {
            LayoutParams layoutParams;
            a(eVar, view.getLayoutParams());
            if (i == d.FLIGHT.ordinal()) {
                eVar.a.setVisibility(0);
                eVar.a.setText(R.string.flight);
                eVar.f.setVisibility(4);
                eVar.c.setVisibility(4);
                eVar.b.setVisibility(4);
                eVar.k.setVisibility(4);
                eVar.i.setBackgroundResource(R.color.list_nomal);
            }
            if (i == d.CONNECT_PLANE.ordinal()) {
                if (!((Setting) this.d.get(d.CONNECT_PLANE.ordinal())).getIsOPen().booleanValue()) {
                    eVar.c.setTextColor(this.c.getResources().getColor(R.color.setting_ash));
                    eVar.i.setBackgroundResource(R.color.list_nomal);
                    eVar.b.setAlpha(0.3f);
                    eVar.f.setAlpha(0.3f);
                }
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.k.setVisibility(4);
                eVar.b.setBackgroundResource(R.drawable.connect_aircraft);
                eVar.c.setText(R.string.connect_plane);
            }
            if (i == d.FIMWARE_UPDATE.ordinal()) {
                if (!((Setting) this.d.get(d.FIMWARE_UPDATE.ordinal())).getIsOPen().booleanValue()) {
                    eVar.c.setTextColor(this.c.getResources().getColor(R.color.setting_ash));
                    eVar.i.setBackgroundResource(R.color.list_nomal);
                    eVar.b.setAlpha(0.3f);
                    eVar.f.setAlpha(0.3f);
                }
                if (((Setting) this.d.get(d.FIMWARE_UPDATE.ordinal())).getIsOPen().booleanValue()) {
                    if (((Setting) this.d.get(d.FIMWARE_UPDATE.ordinal())).isDisplayTv()) {
                        eVar.g.setVisibility(0);
                        eVar.g.setText(this.c.getResources().getString(R.string.new_firmware_upgrade));
                        eVar.h.setVisibility(0);
                    } else {
                        eVar.h.setVisibility(4);
                        eVar.g.setVisibility(4);
                    }
                }
                eVar.k.setVisibility(4);
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setBackgroundResource(R.drawable.firmware_upgrade);
                eVar.b.setVisibility(0);
                eVar.c.setText(R.string.refreshupdate);
            }
            if (i == d.COMPASS_CALIBRATION.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.compass_calibration);
                eVar.c.setText(R.string.compass_calibration);
            }
            if (i == d.NEW_HAND_GUIDE.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.new_hand_guide);
                eVar.c.setText(R.string.new_hand_guide);
            }
            if (i == d.NEW_HAND_MODE.ordinal()) {
                eVar.c.setVisibility(4);
                eVar.d.setVisibility(0);
                eVar.e.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.d.setText(R.string.new_hand_mode);
                eVar.e.setText(R.string.newhand_mode_child);
                eVar.b.setBackgroundResource(R.drawable.control_mode);
                eVar.b.setVisibility(0);
                eVar.j.setVisibility(0);
                if (((Setting) this.d.get(d.NEW_HAND_MODE.ordinal())).getIsOPen().booleanValue()) {
                    eVar.j.a(true, false);
                } else {
                    eVar.j.a(false, false);
                }
                eVar.j.setAlpha(1.0f);
                eVar.j.setTag(Integer.valueOf(d.NEW_HAND_MODE.ordinal()));
                eVar.j.setOnSwitchListener(this);
                layoutParams = view.getLayoutParams();
                layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.setting_adapt_switch);
                eVar.i.setLayoutParams(layoutParams);
                eVar.f.setVisibility(4);
            }
            if (i == d.GPS_MODE.ordinal()) {
                if (((Setting) this.d.get(d.NEW_HAND_MODE.ordinal())).getIsOPen().booleanValue()) {
                    eVar.d.setTextColor(this.c.getResources().getColor(R.color.setting_ash));
                    eVar.e.setTextColor(this.c.getResources().getColor(R.color.setting_ash));
                    eVar.i.setBackgroundResource(R.color.list_nomal);
                    eVar.f.setAlpha(0.3f);
                    eVar.b.setAlpha(0.3f);
                }
                eVar.c.setVisibility(4);
                eVar.d.setVisibility(0);
                eVar.e.setVisibility(0);
                eVar.d.setText(R.string.gps_mode);
                eVar.e.setText(R.string.need_to_unlock_the_newhand_mode);
                eVar.f.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.icon_gps);
                eVar.b.setVisibility(0);
                layoutParams = view.getLayoutParams();
                layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.setting_adapt_switch);
                eVar.i.setLayoutParams(layoutParams);
            }
            if (i == d.OPTICAL_FLOW_MODE.ordinal()) {
                if (((Setting) this.d.get(d.NEW_HAND_MODE.ordinal())).getIsOPen().booleanValue() || ((Setting) this.d.get(d.FORCED_ATTITUDE_MODE.ordinal())).getIsOPen().booleanValue()) {
                    eVar.b.setAlpha(0.3f);
                    eVar.f.setAlpha(0.3f);
                    eVar.d.setTextColor(this.c.getResources().getColor(R.color.setting_ash));
                    eVar.e.setTextColor(this.c.getResources().getColor(R.color.setting_ash));
                    eVar.i.setBackgroundResource(R.color.list_nomal);
                    eVar.j.setAlpha(0.3f);
                } else {
                    eVar.b.setAlpha(1.0f);
                    eVar.f.setAlpha(1.0f);
                    eVar.j.setAlpha(1.0f);
                }
                eVar.j.setTag(Integer.valueOf(d.OPTICAL_FLOW_MODE.ordinal()));
                eVar.j.setOnSwitchListener(this);
                eVar.c.setVisibility(4);
                eVar.d.setVisibility(0);
                eVar.e.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.d.setText(R.string.optical_flow_mode);
                eVar.e.setText(R.string.need_to_unlock_the_newhand_mode);
                eVar.j.setVisibility(0);
                if (((Setting) this.d.get(d.OPTICAL_FLOW_MODE.ordinal())).getIsOPen().booleanValue()) {
                    eVar.j.a(true, false);
                } else {
                    eVar.j.a(false, false);
                }
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.icon_location_mode);
                layoutParams = view.getLayoutParams();
                layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.setting_adapt_switch);
                eVar.i.setLayoutParams(layoutParams);
            }
            if (i == d.FORCED_ATTITUDE_MODE.ordinal()) {
                if (((Setting) this.d.get(d.NEW_HAND_MODE.ordinal())).getIsOPen().booleanValue()) {
                    eVar.b.setAlpha(0.3f);
                    eVar.f.setAlpha(0.3f);
                    eVar.d.setTextColor(this.c.getResources().getColor(R.color.setting_ash));
                    eVar.e.setTextColor(this.c.getResources().getColor(R.color.setting_ash));
                    eVar.i.setBackgroundResource(R.color.list_nomal);
                    eVar.j.setAlpha(0.3f);
                } else {
                    eVar.b.setAlpha(1.0f);
                    eVar.f.setAlpha(1.0f);
                    eVar.j.setAlpha(1.0f);
                }
                eVar.d.setVisibility(0);
                eVar.c.setVisibility(4);
                eVar.e.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.d.setText(R.string.forced_attitude_mode);
                eVar.e.setText(R.string.need_to_unlock_the_newhand_mode);
                eVar.j.setVisibility(0);
                if (((Setting) this.d.get(d.FORCED_ATTITUDE_MODE.ordinal())).getIsOPen().booleanValue()) {
                    eVar.j.a(true, false);
                } else {
                    eVar.j.a(false, false);
                }
                eVar.j.setTag(Integer.valueOf(d.FORCED_ATTITUDE_MODE.ordinal()));
                eVar.j.setOnSwitchListener(this);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.icon_posture_mode);
                layoutParams = view.getLayoutParams();
                layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.setting_adapt_switch);
                eVar.i.setLayoutParams(layoutParams);
            }
            if (i == d.SHOW_MORE_PAT.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setBackgroundResource(R.drawable.flight_parameter);
                eVar.c.setText(R.string.show_more_patter);
                eVar.b.setVisibility(0);
                eVar.j.setVisibility(0);
                if (com.fimi.kernel.c.e().d()) {
                    eVar.j.a(true, false);
                } else {
                    eVar.j.a(false, false);
                }
                eVar.j.setOnSwitchListener(this);
                eVar.j.setTag(Integer.valueOf(d.SHOW_MORE_PAT.ordinal()));
                eVar.f.setVisibility(4);
            }
            if (i == d.REMOTE.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.a.setVisibility(0);
                eVar.a.setText(R.string.remotecontrol);
                eVar.f.setVisibility(4);
                eVar.c.setVisibility(4);
                eVar.b.setVisibility(4);
                eVar.i.setBackgroundResource(R.color.list_nomal);
            }
            if (i == d.CALIBRATION_REMOTE.ordinal()) {
                eVar.k.setVisibility(4);
                if (!((Setting) this.d.get(d.CALIBRATION_REMOTE.ordinal())).getIsOPen().booleanValue()) {
                    eVar.c.setTextColor(this.c.getResources().getColor(R.color.setting_ash));
                    eVar.i.setBackgroundResource(R.color.list_nomal);
                    eVar.b.setAlpha(0.3f);
                    eVar.f.setAlpha(0.3f);
                }
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.the_remote_control_of_calibration);
                eVar.c.setText(R.string.calibration_remote);
            }
            if (i == d.SWITCH_REMOTE_MODE.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.switch_the_remote_control);
                eVar.c.setText(R.string.switch_remote_mode);
                eVar.g.setVisibility(0);
                eVar.g.setText(((Setting) this.d.get(d.SWITCH_REMOTE_MODE.ordinal())).getContent());
            }
            if (i == d.BATTERY.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.a.setVisibility(0);
                eVar.a.setText(R.string.battery);
                eVar.f.setVisibility(4);
                eVar.c.setVisibility(4);
                eVar.b.setVisibility(4);
                eVar.i.setBackgroundResource(R.color.list_nomal);
            }
            if (i == d.SWITCH_RIGHT_MODE.ordinal()) {
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.c.setText(R.string.right_scroll_mode);
                eVar.b.setBackgroundResource(R.drawable.icon_right_pulley_mode);
                eVar.b.setVisibility(0);
                eVar.j.setVisibility(8);
                eVar.f.setVisibility(0);
                eVar.g.setText(((Setting) this.d.get(d.SWITCH_RIGHT_MODE.ordinal())).getContent());
                eVar.g.setVisibility(0);
            }
            if (i == d.BATTERY_INFO.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.icon_battery_parameters);
                eVar.c.setText(R.string.battery_info);
            }
            if (i == d.GIMBAL.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.a.setVisibility(0);
                eVar.a.setText(R.string.gimbal);
                eVar.f.setVisibility(4);
                eVar.c.setVisibility(4);
                eVar.b.setVisibility(4);
                eVar.i.setBackgroundResource(R.color.list_nomal);
            }
            if (i == d.GIMBAL_CALIBRATION.ordinal()) {
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.gimbal_calibration);
                eVar.c.setText(R.string.gimbal_calibration);
            }
            if (i == d.MAP.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.a.setVisibility(0);
                eVar.a.setText(R.string.map);
                eVar.f.setVisibility(4);
                eVar.c.setVisibility(4);
                eVar.b.setVisibility(4);
                eVar.i.setBackgroundResource(R.color.list_nomal);
            }
            if (i == d.SATELLITE_MAP.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setBackgroundResource(R.drawable.satellite_map);
                eVar.c.setText(R.string.sattlite_map);
                eVar.b.setVisibility(0);
                eVar.j.setVisibility(0);
                if (o.a(this.c).e()) {
                    eVar.j.a(true, false);
                } else {
                    eVar.j.a(false, false);
                }
                eVar.j.setOnSwitchListener(this);
                eVar.j.setTag(Integer.valueOf(d.SATELLITE_MAP.ordinal()));
                eVar.f.setVisibility(4);
            }
            if (i == d.CAMERA.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.a.setVisibility(0);
                eVar.a.setText(R.string.camera);
                eVar.f.setVisibility(4);
                eVar.c.setVisibility(4);
                eVar.b.setVisibility(4);
                eVar.i.setBackgroundResource(R.color.list_nomal);
            }
            if (i == d.CAMERA_SETTING.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.camera_settings);
                eVar.c.setText(R.string.camera_setting);
            }
            if (i == d.ACCOUNT.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.a.setVisibility(0);
                eVar.a.setText(R.string.account);
                eVar.f.setVisibility(4);
                eVar.c.setVisibility(4);
                eVar.b.setVisibility(4);
                eVar.i.setBackgroundResource(R.color.list_nomal);
            }
            if (i == d.FLIGHT_RECORD.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.icon_fly_record);
                eVar.c.setText(R.string.flight_record);
                eVar.c.setVisibility(0);
                eVar.f.setVisibility(0);
            }
            if (i == d.FLIGHT_INFO.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.icon_fly_log);
                eVar.c.setText(R.string.fly_logs);
                eVar.c.setVisibility(0);
                eVar.f.setVisibility(0);
            }
            if (i == d.XIAOMI_ACCOUNT.ordinal()) {
                eVar.k.setVisibility(4);
                if (((Setting) this.d.get(d.XIAOMI_ACCOUNT.ordinal())).getIsOPen().booleanValue()) {
                    eVar.g.setText(((Setting) this.d.get(d.XIAOMI_ACCOUNT.ordinal())).getContent());
                    eVar.f.setVisibility(4);
                } else {
                    eVar.g.setText(R.string.exited);
                    eVar.f.setVisibility(0);
                }
                eVar.c.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.mi_id);
                eVar.c.setText(R.string.xiaomi_account);
                eVar.g.setVisibility(0);
            }
            if (i == d.USER_FEEDBACK.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.icon_feedback);
                eVar.c.setText(R.string.user_feedback);
            }
            if (i == d.ABOUT.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.about_icon);
                eVar.c.setText(R.string.about);
                eVar.c.setVisibility(0);
                eVar.f.setVisibility(0);
            }
            if (i == d.HISTORY_MESSAGE.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.icon_message);
                eVar.c.setText(R.string.setting_history_message);
                eVar.c.setVisibility(0);
                eVar.f.setVisibility(0);
            }
            if (i == d.BOTTOM_EDGE_LABLE.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.a.setVisibility(4);
                eVar.f.setVisibility(4);
                eVar.b.setVisibility(4);
                eVar.j.setVisibility(4);
                eVar.h.setVisibility(4);
                eVar.g.setVisibility(4);
                eVar.d.setVisibility(4);
                eVar.e.setVisibility(4);
                eVar.c.setVisibility(4);
                layoutParams = view.getLayoutParams();
                layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.setting_adapt_bottom);
                eVar.i.setLayoutParams(layoutParams);
                eVar.i.setBackgroundResource(R.color.list_nomal);
            }
            if (i == d.PAIR_REMOTE.ordinal()) {
                eVar.k.setVisibility(4);
                if (!((Setting) this.d.get(d.CALIBRATION_REMOTE.ordinal())).getIsOPen().booleanValue()) {
                    eVar.c.setTextColor(this.c.getResources().getColor(R.color.setting_ash));
                    eVar.i.setBackgroundResource(R.color.list_nomal);
                    eVar.b.setAlpha(0.3f);
                    eVar.f.setAlpha(0.3f);
                }
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.icon_match_code);
                eVar.c.setText(R.string.pair_setting_item);
            }
            if (i == d.RELAY_WIFI_CONFIGURE.ordinal()) {
                eVar.k.setVisibility(4);
                if (!((Setting) this.d.get(d.CALIBRATION_REMOTE.ordinal())).getIsOPen().booleanValue()) {
                    eVar.c.setTextColor(this.c.getResources().getColor(R.color.setting_ash));
                    eVar.i.setBackgroundResource(R.color.list_nomal);
                    eVar.b.setAlpha(0.3f);
                    eVar.f.setAlpha(0.3f);
                }
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(0);
                eVar.a.setVisibility(4);
                eVar.b.setVisibility(0);
                eVar.b.setBackgroundResource(R.drawable.setting_wifi_configure_icon);
                eVar.c.setText(R.string.relay_wifi_dialog);
            }
            if (i == d.MAP_CODE_CORREECTION.ordinal()) {
                eVar.k.setVisibility(4);
                eVar.f.setVisibility(0);
                eVar.c.setVisibility(4);
                eVar.a.setVisibility(4);
                eVar.b.setBackgroundResource(R.mipmap.icon_map_correction);
                eVar.d.setText(R.string.map_code_correction);
                eVar.e.setText(R.string.map_code_correction_child);
                eVar.d.setVisibility(0);
                eVar.e.setVisibility(0);
                eVar.b.setVisibility(0);
                eVar.j.setVisibility(0);
                SharedPreferences a = v.a(this.e.d).a();
                com.fimi.soul.biz.n.a a2 = com.fimi.soul.biz.n.a.a();
                if (a.getBoolean(com.fimi.soul.drone.g.c.bN, false)) {
                    eVar.j.a(true, false);
                    a2.a(false);
                } else {
                    eVar.j.a(false, false);
                    a2.a(true);
                }
                eVar.j.setOnSwitchListener(this);
                eVar.j.setTag(Integer.valueOf(d.MAP_CODE_CORREECTION.ordinal()));
                eVar.f.setVisibility(4);
                layoutParams = view.getLayoutParams();
                layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.setting_adapt_switch);
                eVar.i.setLayoutParams(layoutParams);
            }
        }
        return view;
    }
}
