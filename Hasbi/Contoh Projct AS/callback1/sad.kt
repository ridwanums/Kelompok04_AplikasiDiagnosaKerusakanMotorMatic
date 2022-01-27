import RecyclerAdapter.MyViewHolder
import RecyclerAdapter.ItemClickListener

class RecyclerAdapter(private val list: List<String>, context: Context) :
    RecyclerView.Adapter<MyViewHolder?>() {
    private val context: Context
    @NonNull
    fun onCreateViewHolder(@NonNull parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view: View = View.inflate(context, R.layout.item_layout, null)
        val viewHolder = MyViewHolder(view)
        viewHolder.textView = view.findViewById(R.id.text_view)
        viewHolder.linearLayout = view.findViewById(R.id.relativelayout)
        return viewHolder
    }

    fun onBindViewHolder(@NonNull holder: MyViewHolder, position: Int) {
        holder.textView.setText(list[position])
        //Set click events for item layout
        holder.linearLayout.setOnClickListener(object : OnClickListener() {
            fun onClick(v: View?) {
                //Calling the interface method, passing the subscript.
                listener!!.onItemClick(position)
            }
        })
    }

    val itemCount: Int
        get() = list.size()

    inner class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView? = null
        var linearLayout: RelativeLayout? = null
    }

    //Declarative interface
    private var listener: ItemClickListener? = null

    //set method
    fun setListener(listener: ItemClickListener?) {
        this.listener = listener
    }

    //Defining interface
    interface ItemClickListener {
        //Achieve the click method, passing the subscript.
        fun onItemClick(position: Int)
    }

    init {
        this.context = context
    }
}