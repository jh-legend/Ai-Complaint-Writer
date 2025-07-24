package com.example.aicmplaintwriter;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class FirebaseUtils {

    private static FirebaseAuth mAuth;
    private static FirebaseFirestore mDb;

    public static FirebaseAuth getAuthInstance() {
        if (mAuth == null) {
            mAuth = FirebaseAuth.getInstance();
        }
        return mAuth;
    }

    public static FirebaseFirestore getFirestoreInstance() {
        if (mDb == null) {
            mDb = FirebaseFirestore.getInstance();
        }
        return mDb;
    }
}
