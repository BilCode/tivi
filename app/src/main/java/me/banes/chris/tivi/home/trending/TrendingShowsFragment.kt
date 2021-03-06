/*
 * Copyright 2017 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.banes.chris.tivi.home.trending

import android.os.Bundle
import android.view.View
import com.uwetrottmann.trakt5.entities.TrendingShow
import kotlinx.android.synthetic.main.fragment_rv_grid.*
import me.banes.chris.tivi.R
import me.banes.chris.tivi.util.PaginatedGridFragment

class TrendingShowsFragment
    : PaginatedGridFragment<TrendingShow, TrendingShowsViewModel>(TrendingShowsViewModel::class.java) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar.apply {
            title = getString(R.string.discover_popular)
            setNavigationOnClickListener {
                viewModel.onUpClicked()
            }
        }
    }

}
