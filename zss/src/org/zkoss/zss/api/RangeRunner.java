package org.zkoss.zss.api;

/**
 * The runner to help you run multiple {@link Range} APIs in synchronization. 
 * @author dennis
 * @see Range#sync(RangeRunner)
 * @see Range#setSyncLevel(org.zkoss.zss.api.Range.SyncLevel)
 * @since 3.0.0
 */
public interface RangeRunner {

	void run(Range range);
}