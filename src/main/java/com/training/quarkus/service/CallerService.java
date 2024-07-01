package com.training.quarkus.service;

import com.training.quarkus.model.Caller;

public class CallerService {

    private static CallerService instance = null;

    private CallerService() {
    }

    public Caller getCallerByPhone(final String phone) {
        // FIXME Invoke CallerRepository method here.
        return ;
    }

    // TODO Implement missing getInstance method. Check CallerRepository for reference.
}
