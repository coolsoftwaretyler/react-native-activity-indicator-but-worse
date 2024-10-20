#import <React/RCTViewManager.h>
#import <React/RCTUIManager.h>
#import "RCTBridge.h"

@interface ActivityIndicatorButWorseViewManager : RCTViewManager
@end

@implementation ActivityIndicatorButWorseViewManager

RCT_EXPORT_MODULE(ActivityIndicatorButWorseView)

- (UIView *)view
{
  return [[UIView alloc] init];
}

RCT_EXPORT_VIEW_PROPERTY(color, NSString)

@end
