package fr.isen.hadhri.linkedon

import com.google.firebase.database.FirebaseDatabase

class Post  {object Constants{

    val realtimeDBRef= FirebaseDatabase.getInstance().reference.child("RealTimeDB")
    val dataRef=FirebaseDatabase.getInstance().reference.child("data")
}
}