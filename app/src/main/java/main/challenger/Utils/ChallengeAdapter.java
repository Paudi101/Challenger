package main.challenger.Utils;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import main.challenger.R;

public class ChallengeAdapter extends RecyclerView.Adapter<ChallengeAdapter.MyViewHolder> {

    private List<Challenge> challengeList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public  TextView nameTxt, descriptionTxt;
        private ImageView challengeIcon;

        public MyViewHolder(View view) {
            super(view);
            nameTxt = (TextView) view.findViewById(R.id.chal_name);
            challengeIcon = (ImageView) view.findViewById(R.id.challenge_icon);
        }
    }

    public ChallengeAdapter(List<Challenge> challenges) {
        this.challengeList = challenges;
        System.out.println("CHALLENGES : " + this.challengeList);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.challenge_profile_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Challenge challenge = challengeList.get(position);
        holder.nameTxt.setText(challenge.getName());
    }

    @Override
    public int getItemCount() {
        return challengeList.size();
    }
}