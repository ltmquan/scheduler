class CommonHelper {
  calcTimeRemaining(deadline) {
    let today = new Date();

    let diff = Math.abs(deadline.getTime() - today.getTime());

    let daysLeft = parseInt(diff/(1000 * 3600 * 24));

    return daysLeft;
  }

  getTimeRemainingString(deadline) {
    let daysLeft = this.calcTimeRemaining(deadline);

    if (daysLeft == 0) {
      return "IT'S TADAYYYY!!!!";
    } else if (daysLeft == 1) {
      return "Tomorrow!!";
    } else {
      return `${daysLeft} days left`
    }
  }

  calcUrgency(priorityLevel, deadline) {
    let daysLeft = this.calcTimeRemaining(deadline);

    return daysLeft * priorityLevel;
  }

  extractLinks(mergedLinks) {
    let relatedLinks = mergedLinks.split(",");

    return relatedLinks
  }
}

export default new CommonHelper();