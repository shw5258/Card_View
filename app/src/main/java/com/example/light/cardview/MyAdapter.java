package com.example.light.cardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/*이렇게 따로 클래스를 만들수도 있고 메인안에 내부클래스로 만들수도 있다.
* 그때는 이렇게 배열을 받는 생성자가 필요없을 것이다. */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] mDataset;

    public MyAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @Override //invoked by the layout manager
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_card_view, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }//1.반복사용할 view를 view holder에 넣어준다.

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.itemText);
        }//called when onCreateViewHolder is called.

    }//2.view를 잡아둔다는 측면에서 text view를 미리 빼둔다.

    @Override //invoked by the layout manager
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(mDataset[position]);
    }/*3.이 시점에 위치가 결정되므로 미리빼둔 text view에 데이터를
    입력하는 작업도 여기서한다.(위치를 알아야 어느데이터를 넣어야 하는지 알 수 있다.)*/

    @Override //invoked by the layout manager
    public int getItemCount() {
        return mDataset.length;
    }//배열의 길이 정보를 보낸다.
}


