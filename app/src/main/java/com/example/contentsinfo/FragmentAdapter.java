package com.example.contentsinfo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0:
                return new HabitFragment();
            case 1:
                return new NutrientFragment();
            case 2:
                return new DiseaseFragment();
            default:
                return new HospitalFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
