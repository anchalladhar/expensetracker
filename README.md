# expensetracker/walletApp
#A00272269
#A00291274
**Problem Identification & Documentation**
**Identified Issues**
Backend Development Delays

**Problem:** There have been delays in completing the backend development, primarily due to unexpected issues with data synchronization between devices.
**Root Cause:** The integration of multi-device syncing required more time than anticipated due to platform-specific challenges.
**Impact:** This delay caused the backend development phase to extend into the next week, pushing other tasks like testing further back.
****UI Responsiveness on Multiple Devices**

**Problem:*** The app's UI wasn’t responsive across different screen sizes, particularly on tablets and smaller smartphones.
**Root Cause:** Initially, the layout wasn’t designed to be flexible enough for different devices.
****Impact**: The issue delayed the UI/UX design phase, requiring a revision to the wireframes and additional time to ensure the app works seamlessly across all device sizes.
**Budget Management Feature Integration**

**Problem:** The budget management feature did not properly calculate the budget limits based on user-set parameters.
**Root Cause:** A miscalculation error in the algorithm that was implemented to track and compare user spending against the set budget.
**Impact:** This bug delayed the implementation of the budget management functionality, causing additional testing and debugging time.

**Documentation of Root Causes & Analysis
Backend Development Delays**

**Analysis:** The delay was mainly caused by challenges with syncing data across multiple platforms. Specifically, integrating shared data models in Kotlin Multiplatform was more complex than expected.
**Impact on Project Timeline:** This resulted in a one-week delay for the backend, which impacted the overall project schedule. Development timelines had to be adjusted to ensure proper functionality.
**UI Responsiveness on Multiple Devices**

**Analysis**:The root cause was the lack of a responsive layout system that would adjust elements properly across different screen sizes. After reworking the layout with flexible design principles, the issue was resolved.
**Impact on Project Timeline**: The delay led to an additional 3 days spent revisiting UI/UX designs, which extended the design phase by one week.
**Budget Management Feature Integration**

**Analysis**: The miscalculation stemmed from an incorrect algorithm that failed to account for certain edge cases in budget calculations. The issue was identified and fixed after a thorough code review.
**Impact on Project Timeline:** The bug caused delays in the development phase, which extended testing and bug fixing into the next scheduled phase.
